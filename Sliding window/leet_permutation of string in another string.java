///// permutation-in-string leet


class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
            return false;
        int l1 = s1.length();
        int count[] = new int[26];
        for(int i=0;i<l1;i++)
            count[s1.charAt(i)-'a']++;
        for(int i=0;i<l1;i++){
            count[s2.charAt(i)-'a']--;
        }
        if(check(count))
            return true;
        int i=0;
        while(i+l1<s2.length()){
            count[s2.charAt(i)-'a']++;
            count[s2.charAt(i+l1)-'a']--;
            i++;
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