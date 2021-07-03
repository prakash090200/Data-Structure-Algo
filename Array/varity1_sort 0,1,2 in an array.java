// Sort an array of 0s, 1s and 2s

--> https://www.youtube.com/watch?v=oaVa-9wmpns&ab_channel=takeUforward

approach 1: sort(o(nlogn))
app 2: counting sort: o(2n)
app 3: ** o(n)


App 3:
***********************************
int l=0;
int m=0;
int h=arr.length()-1;

while(m<=h){

if(arr[m]==0)
swap(arr[m],arr[l]);
m++;
l++;

else if(arr[m]==1)
m++;

else
swap(arr[m],arr[h])
h--;

}
************************************
class Solution
{
    public static void sort012(int array[], int n)
    {
         int l=0;
           int m=0;
           int h=array.length-1;
           while(m<=h){
               if(array[m]==0){
                   int temp=array[m];
                   array[m++]=array[l];
                   array[l++]=temp;
               }
               else if(array[m]==2){
                   int temp=array[m];
                   array[m]=array[h];
                   array[h--]=temp;
               } 
               else
               m++;
    }
}
}