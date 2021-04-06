https://leetcode.com/problems/longest-substring-without-repeating-characters/


//// longest Distinct character in string



class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            HashSet<Character> h=new HashSet<>();
            int j=i;
            int count=0;
            while(j<s.length() && !h.contains(s.charAt(j))){
                h.add(s.charAt(j));
                count++;
                max=Math.max(count,max);
                j++;
            }
            
        }
        return max;
    }
}