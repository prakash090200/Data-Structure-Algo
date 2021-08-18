https://leetcode.com/problems/shortest-common-supersequence/

// Shortest Common Supersequence


--> if length is asked simple LCM , 
ans--> s1 length + s2 length-(dp[n][m])


// here we need to print that string not the length

class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int dp[][] = new int[n1+1][n2+1];
        
        for(int i = 1; i<=n1; i++){
            for(int j = 1; j<=n2; j++){
                if( s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }    
        }
        
        
        StringBuilder sb = new StringBuilder();
        int i = n1, j = n2;
        
        while( i > 0 && j > 0){
            if( s1.charAt(i-1) == s2.charAt(j-1) ){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }    
            else if( dp[i][j] == dp[i-1][j]  ){
                    sb.append(s1.charAt(i-1));
                    i--;
                }
                else{
                    sb.append(s2.charAt(j-1));
                    j--;                    
                }
            }
        }
        
        while(i > 0){
            sb.append(s1.charAt(i-1));
            i--;
        }
        
        while(j > 0){
            sb.append(s2.charAt(j-1));
            j--;
        }        
        
        return sb.reverse().toString();
        
    }
}