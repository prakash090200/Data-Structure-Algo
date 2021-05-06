https://leetcode.com/problems/majority-element/

/// Majority Element


class Solution {
    public int majorityElement(int[] nums) {
     HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        int ans=-100;
        for(int i=0;i<n;i++)
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        for(int i:h.keySet()){
             if(h.get(i)>n/2)
                 ans=i;
        }
        return ans;
    }
}