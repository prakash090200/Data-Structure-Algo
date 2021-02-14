 ///Subarray Sum Equals K

https://leetcode.com/problems/subarray-sum-equals-k/

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int cursum=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        
    for(int i=0;i<nums.length;i++){
        cursum+=nums[i];
        if(cursum==k)
            count++;
        if(h.containsKey(cursum-k))
            count+=h.get(cursum-k);
        if(h.get(cursum)==null)
            h.put(cursum,1);
        else
            h.put(cursum,h.get(cursum)+1);
            
        
       }
        return count;
    }
}