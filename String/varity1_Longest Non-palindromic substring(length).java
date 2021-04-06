https://www.geeksforgeeks.org/longest-non-palindromic-substring/


Algo:

Check for the case where all characters of
the string are same or not.
    If yes, then answer will be '0'.
Else check whether the given string of size 
'n' is palindrome or not. 
    If yes, then answer will be 'n-1'
Else answer will be 'n' 

**************************************
code:

public class GFG 
{  
    static Boolean isPalindrome(String str) 
    { 
        int n = str.length(); 
  
        // Check for palindrome. 
        for (int i = 0; i < n/2; i++) 
            if (str.charAt(i) != str.charAt(n-i-1)) 
                return false; 
  

        return true; 
    } 
  
 
    static int maxLengthNonPalinSubstring(String str) 
    { 
        int n = str.length(); 
        char ch = str.charAt(0); 
  
        // to check whether all characters 
        // of the string are same or not 
        int i = 1; 
        for (i = 1; i < n; i++) 
            if(str.charAt(i) != ch) 
                break; 
  
        // All characters are same, we can't 
        // make a non-palindromic string. 
        if (i == n) 
            return 0; 

        if (isPalindrome(str)) 
            return n-1; 

        return n; 
    } 

    public static void main(String args[]) 
    { 
        String str = "abba"; 
        System.out.println("Maximum Length = "
             + maxLengthNonPalinSubstring(str)); 
    } 
} 

Output:
Maximum length = 3