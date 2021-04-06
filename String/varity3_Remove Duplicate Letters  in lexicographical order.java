//Remove Duplicate Letters  in lexicographical order
// smallest-subsequence-of-distinct-characters


class Solution {
    public String removeDuplicateLetters(String s) {
         int count[]=new int[26];
        boolean status[]=new boolean[26];
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
         
        sb.append('0');
        for(char c:s.toCharArray()){
            count[c-'a']--;
            
            if(!status[c-'a']){
                 char lc=sb.charAt(sb.length()-1);
                    while(c<lc && count[lc-'a']>0){
                    sb.deleteCharAt(sb.length()-1);
                    status[lc-'a']=false;
                    lc=sb.charAt(sb.length()-1);
               }

                sb.append(c);
                status[c-'a']=true;
            }
        }
        return sb.substring(1).toString();
    }
}