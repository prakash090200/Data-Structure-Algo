https://leetcode.com/problems/shuffle-string/


class Solution {
    public String restoreString(String s, int[] indices) {
        char[] str=new char[s.length()];
        for(int i=0; i<indices.length;i++)
            str[indices[i]]=s.charAt(i);
        return new String(str);
    }
}