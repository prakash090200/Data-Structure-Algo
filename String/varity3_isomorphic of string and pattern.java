
https://leetcode.com/problems/word-pattern/

//290. Word Pattern

class Solution {
    public boolean wordPattern(String pattern, String str1) {
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] str = str1.split(" ");
        if(pattern.length()!=str.length) {
            return false;
        }
        for(int i=0;i<pattern.length();i++) {
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)) {
                if(!map.get(ch).equals(str[i])){
                    return false;
                }
            } else {
                map.put(ch,str[i]);
                if(!set.add(str[i])) return false;
            }
        }
        return true;
    }
}