
https://leetcode.com/problems/valid-anagram/submissions/

///Valid Anagram

--> best****

class Solution {
    
    public boolean isAnagram(String s, String t) 
    {
        int count[] = new int[256];

        for (char c: s.toCharArray())
        {
            count[c]++;
        }

        for (char c: t.toCharArray())
        {
            count[c]--;
        }
        
        int n = 'z';
        for (int i = 'a'; i <= n; i++)
        {
            if (count[i] != 0)
                return false;
        }
        return true;
    }
}
***************************************************************
--> best**
class Solution {
    
    public boolean isAnagram(String s, String t) 
    {
           char c[]=s.toCharArray();
           char c1[]=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        return Arrays.equals(c,c1);
        
    }
}

***************************************************************
class Solution {
    public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    }
    int[] counter = new int[26];
    for (int i = 0; i < s.length(); i++) {
        counter[s.charAt(i) - 'a']++;
        counter[t.charAt(i) - 'a']--;
    }
    for (int count : counter) {
        if (count != 0) {
            return false;
        }
    }
    return true;
}
}