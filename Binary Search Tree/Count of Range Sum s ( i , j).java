https://leetcode.com/problems/count-of-range-sum/


// 327. Count of Range Sum

Given an integer array nums and two integers lower and upper, return the number of range sums that lie in [lower, upper] inclusive.

Range sum S(i, j) is defined as the sum of the elements in nums between indices i and j inclusive, where i <= j.

 
public class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        List<Long> cand = new ArrayList<>();
        cand.add(Long.MIN_VALUE); // make sure no number gets a 0-index.
        cand.add(0L);
        long[] sum = new long[nums.length + 1];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
            cand.add(sum[i]);
            cand.add(lower + sum[i - 1] - 1);
            cand.add(upper + sum[i - 1]);
        }
        Collections.sort(cand); // finish discretization

        int[] bit = new int[cand.size()];
        for (int i = 0; i < sum.length; i++) plus(bit, Collections.binarySearch(cand, sum[i]), 1);
        int ans = 0;
        for (int i = 1; i < sum.length; i++) {
            plus(bit, Collections.binarySearch(cand, sum[i - 1]), -1);
            ans += query(bit, Collections.binarySearch(cand, upper + sum[i - 1]));
            ans -= query(bit, Collections.binarySearch(cand, lower + sum[i - 1] - 1));
        }
        return ans;
    }

    private void plus(int[] bit, int i, int delta) {
        for (; i < bit.length; i += i & -i) bit[i] += delta;
    }

    private int query(int[] bit, int i) {
        int sum = 0;
        for (; i > 0; i -= i & -i) sum += bit[i];
        return sum;
    }
}