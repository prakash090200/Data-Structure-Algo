https://leetcode.com/problems/next-greater-element-ii/

//// Next Greater Element II

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
      
        for(int i=0; i<nums.length; i++)
        {
            while(st.size()>0 && nums[i] > nums[st.peek()] )
            {
                ans[st.pop()] = nums[i];
            }
            st.push(i);
        }
       
        for(int i=0; st.empty()==false && i<nums.length; i++)
        {
            if(nums[st.peek()] < nums[i])
            {
                ans[st.pop()]=nums[i];
                i--;
            }
            
        }
        
        while(st.size()>0)
        {
            ans[st.pop()]=-1;
        }
        return ans;
        
    }
}