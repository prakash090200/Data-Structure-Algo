 ///Subarray Sum Equals K

https://leetcode.com/problems/subarray-sum-equals-k/


o(n2)
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i <= nums.length; i++)
            sum[i] = sum[i - 1] + nums[i - 1];
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                if (sum[end] - sum[start] == k)
                    count++;
            }
        }
        return count;
    }
}

***********************************************
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(sum==k)
            count++;
        if(h.containsKey(sum-k))
            count+=h.get(sum-k);

        h.put(cursum,h.getOrDefault(sum,0)+1);
       }
        return count;
    }
}