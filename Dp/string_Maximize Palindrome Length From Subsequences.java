https://leetcode.com/problems/maximize-palindrome-length-from-subsequences/submissions/


///1771. Maximize Palindrome Length From Subsequences


class Solution {
    
    public int longestPalindrome(String word1, String word2) {
        char[] s = (word1+word2).toCharArray();
        int i, j, len, best = 0, n = s.length, w1 = word1.length();  
        int L[][] = new int[n][n];  
        for (len=1; len<=n; len++) { 
            for (i=0; i<n-len+1; i++) { 
                j = i+len-1; 
                if (s[i] == s[j])  { 
                    if (len < 3) L[i][j] = len; 
                    else L[i][j] = L[i+1][j-1] + 2;    
                    
       if (i < w1 && j >= w1) best = Math.max(best, L[i][j]); 
                } else L[i][j] = Math.max(L[i][j-1], L[i+1][j]); 
            } 
         }        
        return best; 
    } 
}