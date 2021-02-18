https://leetcode.com/problems/longest-consecutive-sequence/

time:o(n)
space:o(n)


class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int val:nums)
            h.add(val);
        int res=0;
        
        for(int val:nums){
            if(!h.contains(val-1)){
                int temp=1;
                while(h.contains(val+1)){
                    temp++;
                    val++;
                }
                res=Math.max(res,temp);
            }
           
        }
        return res;
    }
}


or

time:o(nlogn)
space:o(n) or o(1)
// sorting 

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                if (nums[i] == nums[i-1]+1) {
                    currentStreak += 1;
                }
                else {
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        return Math.max(longestStreak, currentStreak);
    }
}
