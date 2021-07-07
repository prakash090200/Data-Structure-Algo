https://leetcode.com/problems/minimum-window-substring/

////// minimum-window-substring

/// catogory 3

class Solution {
    public String minWindow(String s, String t){
        int[] count = new int[128];

        
        for(int i=0;i<t.length();i++)
            count[t.charAt(i)]++;

      
        String windowString = "";
        
        int wl = 0, charsFoundInWindow = 0,
         minLen = Integer.MAX_VALUE;
        
        
       for(int wr=0;wr<s.length();wr++){
            
            count[s.charAt(wr)]--;
            
            if (count[s.charAt(wr)] >=0) 
                charsFoundInWindow++;
            

        
            while (charsFoundInWindow == t.length()) {
                int currentLen = wr+1 - wl ;
                if(minLen > currentLen){
                    minLen = currentLen;
                    windowString = s.substring(wl, wr + 1);
                    }
                
                  count[s.charAt(wl)]++;
                
                if (count[s.charAt(wl)] >0) 
                    charsFoundInWindow--;
                

                wl++;
            }
 
        }
        
        return windowString;
    }
}