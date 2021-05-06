https://leetcode.com/problems/implement-strstr/
//Normal approach (best)


class Solution {
    public int strStr(String haystack, String needle) {
    if(needle.length() == 0) return 0;
      if(haystack.length() == 0) return -1;  
      if(haystack.contains(needle))return haystack.indexOf(needle);
      return -1;
    }
}

********************************
// kmp

public class Solution {
    
    private int[] failureFunction(char[] str) {
        int[] f = new int[str.length+1];
        for (int i = 2; i < f.length; i++) {
            int j = f[i-1];
            while (j > 0 && str[j] != str[i-1]) j = f[j];
            if (j > 0 || str[j] == str[i-1]) f[i] = j+1;
        }
        return f;
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() <= haystack.length()) {
            int[] f = failureFunction(needle.toCharArray());
            int i = 0, j = 0;
            while (i < haystack.length()) {
                if (haystack.charAt(i) == needle.charAt(j)) {
                    i++; j++;
                    if (j == needle.length()) return i-j;
                } else if (j > 0) j = f[j];
                else i++;
            }
        }
        return -1;
    }

}
