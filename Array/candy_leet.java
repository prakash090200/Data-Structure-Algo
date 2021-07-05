
https://leetcode.com/problems/distribute-candies/submissions/

class Solution {
    public int distributeCandies(int[] candyType) {
        int n=(candyType.length)/2;
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<candyType.length;i++)
            h.add(candyType[i]);
        if(n>h.size())
            return h.size();
        else
            return n;
    }
}