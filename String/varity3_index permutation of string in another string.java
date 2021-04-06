https://leetcode.com/problems/find-all-anagrams-in-a-string/

////Find All Anagrams in a String

class Solution {
    public List<Integer> findAnagrams(String s1, String s2) {
        List<Integer> l = new ArrayList<>();
       if(s1.length()<s2.length())
            return l;
        int l1 = s2.length();
        int count[] = new int[26];
        for(int i=0;i<l1;i++)
            count[s1.charAt(i)-'a']--;
        for(int i=0;i<l1;i++){
            count[s2.charAt(i)-'a']++;
        }
        if(check(count))
            l.add(0);
    
        int i=0;
        while(i+l1<s1.length()){
            count[s1.charAt(i)-'a']++;
            count[s1.charAt(i+l1)-'a']--;
            i++;
            if(check(count))
                l.add(i);
            
        }
        return l;
    }
    
    public boolean check(int a[]){
        for(int i=0;i<26;i++)
            if(a[i]!=0)
                return false;
        return true;
    }
}