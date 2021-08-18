https://leetcode.com/problems/number-of-matching-subsequences/submissions/


//Number of Matching Subsequences

class Solution {
    public static int numMatchingSubseq(String S, String[] words) {
        int result = 0;

        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        for (String word : words) {
            if (!map.containsKey(word)) {
 if (isSubSequence(word, S, word.length(), S.length()) || word.length() == 0) {
                    result++;
                    map.put(word, true);
                } 
           else 
                    map.put(word, false);
                
            } else {
                if (map.get(word)) {
                    result++;
                }
            }

        }

        return result;
    }
    
    static boolean isSubSequence(String str1, String str2, int m, int n) {
        int j = 0;

       
        for (int i = 0; i < n && j < m; i++)
            if (str1.charAt(j) == str2.charAt(i))
                j++;

        return (j == m);
    }
}

****************************************************

optimized DP

class Solution {
    public int numMatchingSubseq(String S, String[] words) {
    int n = S.length(), res = 0;
    int[][] next = new int[n + 1][26];
    Arrays.fill(next[n], -1);
    for(int i = n - 1; i >= 0; i--) {
        for(int j = 0; j < 26; j++) {
            next[i][j] = next[i + 1][j];
        }
        next[i][S.charAt(i) - 'a'] = i + 1;
    }

for(String W: words) {
        int i = 0;
        for(int p = 0; i < W.length(); i++) {
            p = next[p][W.charAt(i) - 'a'];
            if(p == -1) break;
        }
        if(i == W.length()) {
            res++;
        }
    }
    return res;
}
}