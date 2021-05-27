https://leetcode.com/problems/longest-palindromic-substring/

/// 5. Longest Palindromic Substring


class Solution {
    public String longestPalindrome(String s) {
         boolean[][] dp = new boolean[s.length()][s.length()];
    int start = 0, end = 0; 
    for(int i=0;i<s.length();i++)
    {
        dp[i][i]=true;
    }
    for (int i = s.length()-2; i >=0;i--) {
        for (int j =i+1; j<s.length();j++) {
         
        if (s.charAt(j) == s.charAt(i))
            if(dp[i+1][j -1]|| j-i==1 ) {
                
                dp[i][j] = true;
            }

            if (dp[i][j] &&  j-i > end - start ) {
                end = j;
                start = i;
            }
        }
    }

    return s.substring(start, end + 1);
    }
}
***********************************************************************
class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int start=0;
        
        int low,high,end,maxlength=0;
        for(int i=1;i<n;i++){
             low=i-1;
             high=i;
            while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
                if(high-low+1>maxlength){
                    start=low;
                    maxlength=high-low+1;
                }
                low--;
                high++;
            }
              low=i-1;
             high=i+1;
            while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
                if(high-low+1>maxlength){
                    start=low;
                    maxlength=high-low+1;
                }
                low--;
                high++;
            }
       
        }
        if(maxlength==0)
            return s.substring(0,1);
        else{
             end=start+maxlength-1;
            return s.substring(start,end+1);
        }
    }
}