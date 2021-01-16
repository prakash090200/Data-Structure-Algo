//// quick sort 

--> select pivot as last element

class Solution {
    public void sortColors(int[] nums) {
       solve(nums,0,nums.length-1);
    }
    public void solve(int [] nums,int low,int high){
        if(low<high){
        int k=sort(nums,low,high);
            solve(nums,low,k-1);
            solve(nums,k+1,high);
        }
        
    }

/* Imp*/ *******************
    public int sort(int[] nums,int low,int high){
        int pivot=nums[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(nums[j]<pivot){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;
        return i+1;
    }
}

****************************