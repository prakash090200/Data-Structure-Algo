class Solution {
    public int findKthLargest(int[] nums, int k) {
     PriorityQueue<Integer> minheap=new PriorityQueue<>();
     for(int i=0;i<k;i++){
         minheap.add(nums[i]);
     }
        for(int i=k;i<nums.length;i++){
            if(minheap.peek()<nums[i]){
                minheap.poll();
                minheap.add(nums[i]);
            }
                
        }
            
        return minheap.peek();
    }
}
*************************************************

class Solution {
    public int findKthLargest(int[] nums, int k) {
       int n=nums.length;
     for(int i=n/2-1;i>=0;i--)
           maxheapify(nums,n,i);
        
    for(int i=n-1;i>n-k;i--){
        int temp=nums[0];
        nums[0]=nums[i];
        nums[i]=temp;
        
        maxheapify(nums,i,0);
    }
  return nums[0];      
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