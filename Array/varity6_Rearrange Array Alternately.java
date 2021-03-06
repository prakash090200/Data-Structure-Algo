//Rearrange Array Alternately

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