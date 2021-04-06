https://leetcode.com/problems/valid-palindrome/submissions/

// palindrome of string check


class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.isEmpty())
            return true;
        int start=0;
        int end=s.length()-1;
        while(start<end){
            
            if(Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end))){
                
            if(Character.toLowerCase(s.charAt(start++))!=Character.toLowerCase(s.charAt(end--)))
                return false;
            }
            else if(!Character.isLetterOrDigit(s.charAt(start)))
                start++;
            else if(!Character.isLetterOrDigit(s.charAt(end)))
                end--;
            
        }
        return true;
     
    }
}


***********************************************
// BEST**

class Solution {
    public boolean isPalindrome(String s) {
        char[] w = s.toCharArray();
        int left = 0, right = w.length - 1;
        while(left < right) {
			// escape non alphanumeric characters
            while((left < right) && isAlphanumeric(w[left]) == false) left++;
            while((left < right) && isAlphanumeric(w[right]) == false) right--;
			// compare character from begining and end 
            if( tolowercase(w[left]) != tolowercase(w[right]))
                return false;
            left++;
			right--;
        }
        return true;
    }
    
    private char tolowercase(char c) {
        if('0' <= c && c <= '9') return c;
        return (char) (c | 32);
    }
    
    private boolean isAlphanumeric(char c) {
        return ('0' <= c && c <= '9') || ('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z');
    }
}