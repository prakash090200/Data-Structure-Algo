https://www.geeksforgeeks.org/count-of-substrings-of-a-binary-string-containing-only-1s/


//// Count of substrings of a Binary string containing only 1s
class GFG{  
      
 
static int countOfSubstringWithOnlyOnes(String s)  
{  
    int res = 0, count = 0;  
    for(int i = 0; i < s.length(); i++)  
    {  
        count = s.charAt(i) == '1' ? count + 1 : 0;  
        res = (res + count);  
    }  
    return res;  
}  