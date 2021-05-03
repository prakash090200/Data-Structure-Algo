https://leetcode.com/problems/trapping-rain-water/submissions/

https://www.geeksforgeeks.org/trapping-rain-water/

time:O(N)
SPACE:O(1)


class Solution {
    public int trap(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int left=0;
        int right=0;
        int res=0;
        while(low<high){
            if(arr[low]<arr[high]){
                if(arr[low]>left)
                    left=arr[low];
                else
                    res+=left-arr[low];
        
                low++;
            }
            else{
                if(arr[high]>right)
                    right=arr[high];
                else
                    res+=right-arr[high];
                high--;
            }
        }
        return res;
    }
}

**************************************************

time:O(N)
SPACE:O(N)

class Main{
  public static void main(String [] args){
    int arr[]={3, 0, 2, 0, 4};
    int [] right=new int[5];
    int [] left=new int[5];
    //int [] water=new int[];
    int max=0;
    int sum=0;
    for(int i=0;i<arr.length;i++){
      max = Math.max(max, arr[i]);
      left[i]=max;
    }
    max=0;
      for(int i=arr.length-1;i>=0;i--) {
        max = Math.max(max, arr[i]);
        right[i]=max;
      }
    for(int i=0;i<arr.length;i++)
      sum+=Math.min(left[i],right[i])-arr[i];
    System.out.println(sum);

  }

}
