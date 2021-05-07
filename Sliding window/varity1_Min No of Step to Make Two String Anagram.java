https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/

// Minimum Number of Steps to Make Two Strings Anagram


class Solution {
    public int minSteps(String s, String t) {
        int len = s.length();
        int count = 0;
        int[] countS = new int[26];
        int[] countT = new int[26];
        for(int i=0;i<len;i++) {
            countS[(int)(s.charAt(i) - 'a')]++;
            countT[(int)(t.charAt(i) - 'a')]++;
        }
        
        for(int i=0;i<26;i++) {
            if(countS[i]-countT[i] > 0) {
                count += (countS[i] - countT[i]);
            } 
        }
        
        return count;
    }
}