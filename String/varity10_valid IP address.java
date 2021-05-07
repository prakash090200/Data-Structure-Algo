https://leetcode.com/problems/validate-ip-address/


import java.util.regex.Pattern;
class Solution {
  String chunkIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
  Pattern pattenIPv4 =
          Pattern.compile("^(" + chunkIPv4 + "\\.){3}" + chunkIPv4 + "$");

  String chunkIPv6 = "([0-9a-fA-F]{1,4})";
  Pattern pattenIPv6 =
          Pattern.compile("^(" + chunkIPv6 + "\\:){7}" + chunkIPv6 + "$");

  public String validIPAddress(String IP) {
    if (pattenIPv4.matcher(IP).matches()) return "IPv4";
    return (pattenIPv6.matcher(IP).matches()) ? "IPv6" : "Neither";
  }
}

**********************************************************************

class Solution {
  public String validateIPv4(String IP) {
    String[] nums = IP.split("\\.", -1);
    for (String x : nums) {
 
      if (x.length() == 0 || x.length() > 3) return "Neither";

      if (x.charAt(0) == '0' && x.length() != 1) return "Neither";

      for (char ch : x.toCharArray()) {
        if (! Character.isDigit(ch)) return "Neither";
      }
  
      if (Integer.parseInt(x) > 255) return "Neither";
    }
    return "IPv4";
  }

  public String validateIPv6(String IP) {
    String[] nums = IP.split(":", -1);
    String hexdigits = "0123456789abcdefABCDEF";
    for (String x : nums) {
 
      if (x.length() == 0 || x.length() > 4) return "Neither";

      for (Character ch : x.toCharArray()) {
        if (hexdigits.indexOf(ch) == -1) return "Neither";
      }
    }
    return "IPv6";
  }

  public String validIPAddress(String IP) {
    if (IP.chars().filter(ch -> ch == '.').count() == 3) {
      return validateIPv4(IP);
    }
    else if (IP.chars().filter(ch -> ch == ':').count() == 7) {
      return validateIPv6(IP);
    }
    else return "Neither";
  }
}


***********************************************************************
BEST **

class Solution {
   

    public boolean validIPv4(String IP) {

    
        String[] xs = IP.split("\\.", -1);

    
        if ( xs.length != 4 ) { return false; }

        for ( String xn : xs ) {

            int val;

        
            try { val = Integer.parseInt(xn); }
            catch ( NumberFormatException e ) { return false; }
            
         
            if ( val < 0 || val > 255 ) { return false; }
            
          
            if ( Integer.toString(val).length() != xn.length() ) { return false; }
        }

       
        return true;
    }

    public boolean validIPv6(String IP) {

       
        String[] xs = IP.split(":", -1);

        if ( xs.length != 8 ) { return false; }
        
       
        for ( String xn : xs ) {


            if ( xn.length() < 1 || xn.length() > 4 ) { return false; }
    
            try { Integer.parseInt(xn, 16); }
            catch ( NumberFormatException e ) { return false; }
        }

        return true;
    }

    public String validIPAddress(String IP) {

        
        String ret = "Neither";
        int len = IP.length();

  
        if ( (IP != null) && (len >= 7) && (len <= 39) ) {

            
            if ( len <= 14 ) {
                if ( validIPv4(IP) ) { ret = "IPv4"; }
            }

            
            else if ( len == 15 ) {
                if ( validIPv4(IP) ) { ret = "IPv4"; }
                else
                if ( validIPv6(IP) ) { ret = "IPv6"; }
            }

        
            else {
                if ( validIPv6(IP) ) { ret = "IPv6"; }
            }
        }

        return ret;
    }
}
