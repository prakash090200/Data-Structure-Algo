https://www.geeksforgeeks.org/given-binary-string-count-number-substrings-start-end-1/

 ////Given a binary string, count number of substrings that start and end with 1.

class CountSubString  
{ 
    int countSubStr(char str[], int n)  
    { 
        int m = 0; // Count of 1's in input string 
  
        // Traverse input string and count of 1's in it 
        for (int i = 0; i < n; i++)  
        { 
            if (str[i] == '1') 
                m++; 
        } 
  
        // Return count of possible pairs among m 1's 
        return m * (m - 1) / 2; 
    } 

