
https://leetcode.com/problems/word-break-ii/


///140. Word Break II

class Solution {
    public List<String> wordBreak(String s, List<String> wd) {        
        return findsol(s,wd, new HashMap<>());
    }
    
    public List<String> findsol(String s, List<String> wd, Map<String, List<String>> m){
        if(m.containsKey(s)){
            return m.get(s);
        }
        
        List<String> sol = new ArrayList<>();
        for(String word: wd){
            if(!s.startsWith(word)){
                continue;
            }
            
            if(s.length() == word.length()){
                sol.add(word);
                continue;
            }
            
            List<String> soll = findsol(s.substring(word.length()), wd, m);
            for(String ss: soll) {
                StringBuilder sb = new StringBuilder();
                sb.append(word).append(' ').append(ss);
                sol.add(sb.toString());
            }
        }
        
       
        return sol;
    }
}