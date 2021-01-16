class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
     for(int i=n/2-1;i>=0;i--)
           maxheapify(nums,n,i);
        
    for(int i=n-1;i>0;i--){
        int temp=nums[0];
        nums[0]=nums[i];
        nums[i]=temp;
        
        maxheapify(nums,i,0);
    }
}
public void maxheapify(int [] nums,int n, int i){
    int largest=i;
    int leftchild=2*i+1;
    int rightchild=2*i+2;
    if(leftchild<n && nums[leftchild]>nums[largest]){
        largest=leftchild;
        
    }
    if(rightchild<n && nums[rightchild]>nums[largest]){
        largest=rightchild;
    }
    if(i!=largest){
        int temp=nums[i];
        nums[i]=nums[largest];
        nums[largest]=temp;
        maxheapify(nums,n,largest);
    }
  }
}