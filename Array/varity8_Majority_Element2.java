https://leetcode.com/problems/majority-element-ii/


//// Majority Element II

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        for(int i:h.keySet()){
             if(h.get(i)>n/3)
                 l.add(i);
        }
        return l;
    }
}