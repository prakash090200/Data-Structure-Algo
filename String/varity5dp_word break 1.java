https://leetcode.com/problems/word-break/submissions/

///139. Word Break

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        if (n == 0 || s == null) return false;
        System.out.println(wordDict.size());
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 0; i < n; i++){
            if (!dp[i]) continue;
            for (String word: wordDict){
                int j = i + word.length();
                if (j <= n && s.substring(i, j).equals(word)){
                    dp[j] = true;
                }
            }
        }
        return dp[n];
    }
}

