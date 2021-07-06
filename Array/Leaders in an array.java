https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1#



//Leaders in an array
class Solution{
 
    static ArrayList<Integer> leaders(int arr[], int n){
       ArrayList<Integer> a=new ArrayList<>();
        a.add(arr[n-1]);
        int max=arr[n-1];
           
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
            max=arr[i];
            a.add(max);
            }
            
        }
        Collections.reverse(a);
        return a;
    }
}
