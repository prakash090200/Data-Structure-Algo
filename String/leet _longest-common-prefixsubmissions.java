//// longest-common-prefix/submissions


class Solution {
public String longestCommonPrefix(String[] strs) {
if (strs == null || strs.length == 0) 
return "";

String prefix = "";
for (int char_index = 0; char_index < strs[0].length(); char_index++) {
char c = strs[0].charAt(char_index);
for (int strs_index = 1; strs_index < strs.length; strs_index++) {
    
if (char_index >= strs[strs_index].length()) 
return prefix;

if (c != strs[strs_index].charAt(char_index)) 
return prefix;
        
}
    
prefix = strs[0].substring(0, char_index + 1);
}
return prefix;
}
}