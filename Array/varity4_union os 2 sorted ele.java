https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1#

//Merge Without Extra Space

class Solution
{
    
    public static void merge(long a[], long b[], int n, int m) 
    {
        int i=n-1,j=0;
        while(i>=0&&j<m){
            if(a[i]>b[j]){

                //swap without using extra space ******
                a[i]=a[i]+b[j];
                b[j]=a[i]-b[j];
                a[i]=a[i]-b[j];
                
                i--;
                j++;
            }
            else
            i--;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
