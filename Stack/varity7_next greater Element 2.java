https://leetcode.com/problems/next-greater-element-ii/

//// Next Greater Element II   (using stack)

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i=0; i<nums.length; i++)
        {
            while(st.size()>0 && nums[i] > nums[st.peek()] )
            {
                ans[st.pop()] = nums[i];
            }
            st.push(i);
        }
       
        for(int i=0;i<nums.length; i++)
        {
            while(st.size()>0 && nums[i] > nums[st.peek()])
            {
                ans[st.pop()]=nums[i];
                
            }
            
        }
        
        
        return ans;
        
    }
}