////// minimum-window-substring


class Solution {
    public String minWindow(String s, String t) {
        int[] count = new int[128];

        
        for(int i=0;i<t.length();i++)
            count[t.charAt(i)]++;

      
        String windowString = "";
        
        int windowLeft = 0, windowRight = 0, charsFoundInWindow = 0,
         minWindowLen = Integer.MAX_VALUE;
        
        
        while (windowRight < s.length()) {
            
            count[s.charAt(windowRight)]--;
            
            
            if (count[s.charAt(windowRight)] >= 0) {
                charsFoundInWindow++;
            }

        
            while (charsFoundInWindow == t.length()) {
                int currentWindowLen = windowRight - windowLeft + 1;
                if(minWindowLen > currentWindowLen) {
                    minWindowLen = currentWindowLen;
                    windowString = s.substring(windowLeft, windowRight + 1);
                }
                
                count[s.charAt(windowLeft)]++;
                
                
                
                if (count[s.charAt(windowLeft)] > 0) {
                    charsFoundInWindow--;
                }
                windowLeft++;
            }
            
            windowRight++;  
        }
        
        return windowString;
    }
}