
https://leetcode.com/problems/power-of-two/submissions/
////231. Power of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        return ( (n & (n-1)) == 0) ? true: false;
    }
}
*****************************************
or


class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        return (Integer.bitCount(n)==1) ? true: false;
    }
}