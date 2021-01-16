/// merge_sort 


class Solution {
    public void sortColors(int[] nums) {
       solve(nums,0,nums.length-1);
    }
    public void solve(int [] nums,int low,int high){
        if(low<high){
        int mid=(low+high)/2;
            solve(nums,low,mid);
            solve(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
        
    }

/*imp*/*************************************************************
   public void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
                
            }
            else {
                arr[k++] = R[j++];
                
            }
            
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k++] = L[i++];
          
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k++] = R[j++];
            
        }
    }   
}





2nd way ***************************************************************************************


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