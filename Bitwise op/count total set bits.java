https://practice.geeksforgeeks.org/problems/set-bits0143/1

class Solution {
    static int setBits(int n) {
      int count=0;
     while(n!=0){
         int rsm=(n &-n);
         n-=rsm;
         count++;
         
     }
        return count;
       ///return Integer.bitCount(N);
    }
}