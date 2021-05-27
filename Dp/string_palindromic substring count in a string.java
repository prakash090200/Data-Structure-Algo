
https://leetcode.com/problems/palindromic-substrings/

//647. Palindromic Substrings




class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        if(n == 0){
            return 0;
        }
        boolean[][] dp= new boolean[n][n];
        for(int i = 0; i < n; i++){
            dp[i][i] = true;
            ans++;
        }
        for(int i = 0; i < n - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                dp[i][i + 1] = true;
                ans++;
            }
        }
        int start, end;
        for(int l = 3; l <= n; l++){
            start = 0;
            end = start + l - 1;
            
            while(end < n){
                if(dp[start + 1][end - 1] == true && s.charAt(start) == s.charAt(end)){
                    dp[start][end] = true;
                    ans++;
                }
                start++;
                end = start + l - 1;
            }
        }
        return ans;
    }
}