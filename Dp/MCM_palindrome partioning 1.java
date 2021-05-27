
https://leetcode.com/problems/palindrome-partitioning/submissions/

//Palindrome Partitioning

-> list print 


class Solution {
    public List<List<String>> partition(String s) {
        
        boolean[][] dp = new boolean[s.length()][s.length()];
        
        
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result, dp);
        return result;
    }
    
private void backtrack(String str, int pos, List<String> temp, List<List<String>> result, boolean[][] dp) {
        
        
        if(pos == str.length()) {
            result.add(new ArrayList<String>(temp));
            return;
        }
        
        for(int i = pos; i < str.length(); ++i) {
            
            if(dp[pos][i] || isPalindrome(str, pos, i, dp)) {
                temp.add(str.substring(pos, i + 1));
                backtrack(str, i + 1, temp, result, dp);
                temp.remove(temp.size() - 1);
            }
        }
    }
    
    
    private boolean isPalindrome(String str, int start, int end, boolean[][] dp) {
        int low = start;
        int high = end;
        while(start <= end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            ++start;
            --end;
        }
        dp[low][high] = true;
        return dp[low][high];
    }
}