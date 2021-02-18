https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1

//Triplet Sum in Array 
// time:o(n2)
//space :o(1)

class TripletSum
{
  
    public static boolean find3Numbers(int arr[], int n, int x) { 
        boolean flag=false;
    Arrays.sort(arr);
    label:
       for(int i=0;i<n-1;i++){
           int low=i+1;
           int high=n-1;
           while(low<high){
               if(arr[i]+arr[low]+arr[high]==x){
                   flag=true;
                   break label;
               }
               else if(arr[i]+arr[low]+arr[high]<x)
               low++;
               else
               high--;
               
           }
       }
       return flag;
    
    }
}
