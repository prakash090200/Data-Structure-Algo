
https://leetcode.com/problems/reverse-bits/submissions/

// 190. Reverse Bits

public class Solution {
   
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
 
        int mask=n & 1;
        int rev=mask<<(31-i);
        result=rev | result;
         n=n>>1;
        }
        return result;
    }
        
}