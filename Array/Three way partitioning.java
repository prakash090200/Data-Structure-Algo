https://practice.geeksforgeeks.org/problems/three-way-partitioning/1
/// Three way partitioning

class Solution{
    public void threeWayPartition(int arr[], int a, int b)
    {
         int low=0;
         int mid=0;
         int high=arr.length-1;
         while(mid<=high){
             if(arr[mid]<a){
                 int temp=arr[mid];
                 arr[mid]=arr[low];
                 arr[low]=temp;
                 low++;
                 mid++;
             }
             else if(arr[mid]>b){
                 int temp=arr[mid];
                 arr[mid]=arr[high];
                 arr[high]=temp;
                 high--;
             }
             else
             mid++;
             
         }
    }
   
}
