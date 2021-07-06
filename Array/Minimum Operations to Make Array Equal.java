https://leetcode.com/problems/minimum-operations-to-make-array-equal/

https://www.youtube.com/watch?v=9aGx9hoIBjI&ab_channel=AlgorithmsMadeEasy

/// Minimum Operations to Make Array Equal


Approach 1:  Note the n = median value since i -> 2(i)+1
class Solution {
    public int minOperations(int n) {

        int count=0;
        for(int i=0;i<n/2;i++){
            count+=n-(2*i+1);
       }
        return count;
    }
}

*************************************************
class Solution {
    public int minOperations(int n) {
       
        int mid=n/2;
       if(n%2==0)
           return (mid*mid);
           else
           return mid*(mid+1);
       
    }
}