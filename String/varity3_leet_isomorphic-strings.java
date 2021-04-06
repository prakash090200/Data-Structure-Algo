https://leetcode.com/problems/isomorphic-strings/

///// isomorphic-strings


---> best complexity

class Solution {
   
   public boolean isIsomorphic(String s, String t) {
		int[] s1 = new int[128];
		int[] s2 = new int[128];
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			if (s1[c1] != s2[c2]) {
				return false;
			}
			s1[c1] = i + 1;
			s2[c2] = i + 1;
		}
		return true;
	}
}
******************************************************

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        
        if(s.length()!=t.length())
            return false;
       
        HashMap<Character,Character> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ca=s.charAt(i);
            char cb=t.charAt(i);
            if(!h.containsKey(ca) && !h.containsValue(cb))
                h.put(ca,cb);
            else if(!h.containsKey(ca) && h.containsValue(cb) || !h.get(ca).equals(cb) )
                return false;
        }
        return true;
        
    }
}