https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/

/// 995. Minimum Number of K Consecutive Bit Flips


class Solution {
    public int minKBitFlips(int[] A, int K) {
      
        int out = 0, count=0;
       
        for(int i=0; i<A.length; i++){
            
            if( (A[i]==0 && count%2==0) || (A[i]==1 && count%2!=0)){
                count++;
                out++;
                if(i+K-1>=A.length){
                    
                    return -1;
                }else{
                   
                    checkFlip[i+K-1] = true;
                }
            }
            if(checkFlip[i]){
                
                count--;
            }
        }
        return out;
    }
}