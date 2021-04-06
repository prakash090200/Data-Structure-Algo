https://leetcode.com/problems/rotate-string/submissions/

////leet_rotate String left side 

class Solution {
   
    public boolean rotateString(String A, String B) {
        
        if(A.length()!=B.length())
            return false;
        if(A.length()==0)
            return true;
        
        loop1:
       for(int i=0;i<A.length();i++){
           for(int j=0;j<A.length();j++){
               if(A.charAt((i+j)%A.length())!=B.charAt(j))
                   continue loop1;
                 
           }
           return true;
           }
           return false;
}
}

**************************************
class Solution {
    public boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}