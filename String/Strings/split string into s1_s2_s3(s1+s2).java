https://leetcode.com/problems/number-of-ways-to-split-a-string/submissions/
///Number of Ways to Split a String int 3 string 

///s1,s2,s3
///s3=s1+s2

//String should contain only 0 and 1


class Solution {
    public int numWays(String s) {
        

        char[] sc = s.toCharArray();                        
        int[] ones = new int[Math.min(sc.length, 6000)];
        int onesCount = 0;
        for (int i = 0; i < sc.length; i++) {
            if (sc[i] == '1') {
                ones[onesCount] = i;
                onesCount++;
            }
        }


        if (onesCount % 3 != 0)  return 0;
        
 
        if (onesCount == 0) {
            return (int)(((long)(s.length() - 2) * 
                          (long)(s.length() - 1) / 2L) % 1000000007L);
        }
        
        
        int end1 = ones[onesCount / 3 - 1];
        int start2 = ones[onesCount / 3];
        int end2 = ones[onesCount * 2 / 3 - 1];
        int start3 = ones[onesCount * 2 / 3];
        return (int)((long)(start2 - end1) * 
                     (long)(start3 - end2) % 1000000007L);
    }
}