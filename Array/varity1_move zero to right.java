https://leetcode.com/problems/move-zeroes/

//best****
class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        int i=0;
        while(i<=nums.length-1){
            if(nums[i]!=0){
               
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j++]=temp;
                }
                i++;
                
            }
    
    }
}

********************************************************8
class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=j){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                j++;
            }
        }
    }
}

