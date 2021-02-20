/// Minimum Operations to Make Array Equal

https://leetcode.com/problems/minimum-operations-to-make-array-equal/

class Solution {
    public int minOperations(int n) {

        int count=0;
        for(int i=0;i<n/2;i++){
            count+=n-(2*i+1);
       }
        return count;
    }
}