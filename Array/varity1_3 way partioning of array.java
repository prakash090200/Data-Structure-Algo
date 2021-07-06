
https://practice.geeksforgeeks.org/problems/three-way-partitioning/1#

//Three way partitioning

approach 1: sort(o(nlogn))
app 2: counting sort: o(2n)
app 3: ** o(n)
       |
       v
class Solution{
   
public void threeWayPartition(int arr[], int a, int b){
int l=0;
int m=0;
int h=arr.length-1;
int temp=0;

while(m<=h){

if(arr[m]<a){
    temp=arr[l];
    arr[l++]=arr[m];
    arr[m++]=temp;
}


else if(arr[m]>b){
    temp=arr[m];
    arr[m]=arr[h];
    arr[h--]=temp;
}


else
m++;
}
    }
}
