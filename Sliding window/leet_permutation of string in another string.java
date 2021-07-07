https://leetcode.com/problems/permutation-in-string/


///// permutation-in-string leet
// catogory 1

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        int l1 = s1.length();
        int count[] = new int[26];
        int j=0;
        for(j=0;j<l1;j++)
            count[s1.charAt(j)-'a']++;
        for(int i=0;i<l1;i++)
            count[s2.charAt(i)-'a']--;
        
        if(check(count))
            return true;
       for(int i=0;i<s2.length()-l1;i++){
            count[s2.charAt(i)-'a']++;
            count[s2.charAt(j++)-'a']--;
           
            if(check(count))
                return true;
        
        }
        return false;
    }
    
    public boolean check(int a[]){
        for(int i=0;i<26;i++)
            if(a[i]!=0)
                return false;
        return true;
    }
    
} 