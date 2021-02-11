//// Merge Intervals

class Solution {
    public int[][] merge(int[][] nums) {
        
      
        
       
        Arrays.sort(nums, (a,b)->a[0]-b[0]);
        int n = nums.length;
        
  
        int start = nums[0][0];
        int end = nums[0][1];
        
        ArrayList<int[]> ans = new ArrayList<>();
        for(int i = 1; i < n; i++){
    
            if(nums[i][0] > end){
                ans.add(new int[]{start, end});
                start = nums[i][0];
                end = nums[i][1];
            }
           
            else if(nums[i][1] >= end){
                end = nums[i][1];
            }
        }
        

        ans.add(new int[]{start, end});
        
        return ans.toArray(new int[ans.size()][2]);
        
    }
}