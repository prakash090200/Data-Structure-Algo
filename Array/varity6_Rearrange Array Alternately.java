https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1

//Rearrange Array Alternately



class Solution{
       public static void rearrange(int arr[], int n){
           Arrays.sort(arr);
           int temp[]=arr.clone();
        int s=0;
        int e=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0)
                arr[i]=temp[e--];
            
            else
            arr[i]=temp[s++];
        }
    }
    
}
******************************************
class Solution{
       public static void rearrange(int arr[], int n){
           Arrays.sort(arr);
           boolean flag=true;
           int temp[]=arr.clone();
        int s=0;
        int e=n-1;
        for(int i=0;i<n;i++){
            if(flag)
                arr[i]=temp[e--];
            
            else
            arr[i]=temp[s++];
            
            flag=!flag;
        }
    }
    
}

***************************************************
class RearrangeAlternate{
    
    public static void rearrange(int arr[], int n){
        
        int k=0;
        int m=0;
      if(n%2==0)
      k=n/2;
      else{
          k=(n-1)/2;
          m=arr[((n+1)/2)-1];
      }
      int a[]=new int[n];
      int ar[]=new int[n];
      for(int i=0;i<n;i++)
      ar[i]=arr[i];
      int l=-1;
      
      for(int i=n-1;i>=0;i--)
          a[++l]=arr[i];
    
    l=-1;
    
      for(int i=0;i<k;i++){
          arr[++l]=a[i];
          arr[++l]=ar[i];
          
      }
      if(n%2!=0)
      arr[n-1]=m;
    }
    
}