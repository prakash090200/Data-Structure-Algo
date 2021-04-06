https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/submissions/

//// Remove All Adjacent Duplicates In String

class Solution {
    public String removeDuplicates(String S) {
        
        return checkAndRemove(S);
    }
    
    public String checkAndRemove(String s){
        if(s.length()==1) return s;
        
        for(int i = 0; i < s.length()-1;i++){
            String c = s.charAt(i)+"";
            if(s.charAt(i) == s.charAt(i+1)){
                s = s.replace(c+c,"");
                System.out.println(s);
                return checkAndRemove(s);
            }
        }
        return s;
    }
}