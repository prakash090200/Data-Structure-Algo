https://practice.geeksforgeeks.org/problems/longest-common-substring1452/1

//Longest Common Substring

class Solution{
    int longestCommonSubstr(String text1, String text2, int n, int m){
        int s1=text1.length();
        int s2=text2.length();
        int result=0;
        int dp[][]=new int[s1+1][s2+1];
        for(int i=1;i<s1+1;i++)
        for(int j=1;j<s2+1;j++){
            if(text1.charAt(i-1)==text2.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
                result = Integer.max(result,dp[i][j]);
            }
            else 
                dp[i][j]=0;
        }
        return result;
        
    }
}