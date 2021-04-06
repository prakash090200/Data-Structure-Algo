https://leetcode.com/problems/longest-common-prefix/submissions

//  Longest Common Prefix


class Solution {
public String longestCommonPrefix(String[] strs) {
if (strs == null || strs.length == 0) 
return "";

String prefix = "";
    //ci=char_index
    //si=str_index
for (int ci = 0; ci < strs[0].length(); ci++) {
char c = strs[0].charAt(ci);
for (int si = 1; si < strs.length; si++) {
    
if (ci >= strs[si].length()) 
return prefix;

if (c != strs[si].charAt(ci)) 
return prefix;
        
}
  
    
    
prefix = strs[0].substring(0, ci + 1);
}
return prefix;
}
}