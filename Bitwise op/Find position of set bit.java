https://practice.geeksforgeeks.org/problems/find-position-of-set-bit3706/1#

// https://www.youtube.com/watch?v=Ztt-VtNyqL8&ab_channel=TECHDOSE

//Find position of set bit 

class Solution {
    static int findPosition(int n) {
        
        if(Integer.bitCount(n)!=1)
        return -1;
        else{
              int count=1;  
             while((n&1)!=1){
               
                count++;
                n=n>>1;
              }
                return count;
        
            }
    }
}