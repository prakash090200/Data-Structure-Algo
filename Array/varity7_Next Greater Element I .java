
https://leetcode.com/problems/next-greater-element-i/

/// Next Greater Element I

/// best***  (using stack) 00> first greatest no , ya 1st smallest no always use stack for these type of problem.

class Solution {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums2.length; i++) 
            map.put(nums2[i],i);
        
		int ans[]=new int[nums2.length];
        Arrays.fill(ans,-1);
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!s.empty() && nums2[i]>nums2[s.peek()])
                ans[s.pop()]=nums2[i];
            
            s.push(i);
        }
        //System.out.println(Arrays.toString(ans));
        for(int i=0;i<nums1.length;i++){
            int ind=map.get(nums1[i]);
            nums1[i]=ans[ind];
        }
        return nums1;
	}
}

*********************************************************************
class Solution {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums2.length; i++) 
            map.put(nums2[i],i);
        
		for (int i = 0; i < nums1.length; i++) {
	            int ind = map.get(nums1[i]);
			    int fill = -1;
			    for (int j = ind+1; j < nums2.length; j++) 
				if (nums2[j] > nums1[i]) {
					fill = nums2[j];
					break;
				}
			nums1[i] = fill;
		}
		return nums1;
	}
}


