//// Check if string is rotated by two places
class Rotation{

    public static boolean isRotated(String s1, String s2){
        
      boolean flag=false;
      int len=s1.length();
      if(len>2){
      String stranticlock=s1.substring(2)+s1.substring(0,2);
      String strclockwise=s1.substring(len-2)+s1.substring(0,len-2);
      if(stranticlock.equalsIgnoreCase(s2) || strclockwise.equalsIgnoreCase(s2))
      flag=true;
      }
      else{
          if(s1.equalsIgnoreCase(s2))
          flag=true;
      }
      
      return flag;  
    }
    
}