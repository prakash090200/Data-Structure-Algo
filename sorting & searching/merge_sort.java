https://practice.geeksforgeeks.org/problems/merge-sort/1#

//Merge Sort 

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        int n1 =  m-l+1;
        int n2 = r-m;
        
        int a[] = new int[n1];
        int b[] = new int[n2];
        
        int p =0;
        int q = 0;
        
        for(int i=0;i<n1;i++)
        a[i] = arr[i+l];
        for(int i=0;i<n2;i++)
        b[i] = arr[i+m+1];
        
        
        int k = l;
        while(p<n1 && q<n2){
            if(a[p]<=b[q]){
                arr[k] = a[p];
                p++;
            }
            else {
                arr[k] = b[q];
                q++;
            }
            k++;
        }
        while(p<n1){
            arr[k++] = a[p++];
        }
        while(q<n2){
            arr[k++] = b[q++];
        }
    }
    
    void mergeSort(int arr[], int l, int r)
    {
        
        if(l<r){
            int m = (l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
            }  
        } 
}