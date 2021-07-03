 
https://practice.geeksforgeeks.org/problems/https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1-1587115621/1

// Subarray with given sum

//best
class Solution
{
    
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer>a=new ArrayList<>();
        
        
       
        int i=0,sum=0;
	    for(int j=0;j<n;j++){
	        sum+=arr[j];
	        while(sum>s)
	        sum-=arr[i++];
	        if(sum==s){
	            a.add(i+1);
	            a.add(j+1);
	            break;
	        }
	    }
	    
	    
	    if(a.size()==0)
         a.add(-1);
        return a;
    }
}

**************************************************************
class Solution
{
    
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer>a=new ArrayList<>();
        
        
       
         int start=0;
         int end=0;
         int sum=0;
        while(end<n){
             while(sum<s && end<n){
                 sum+=arr[end++];
                
             }
            
             while(sum>s && start<n){
                 sum-=arr[start];
                 start++;
             }
             if(sum==s){
                 a.add(start+1);
                 a.add(end);
                 break;
             }
         }
	    
	    if(a.size()==0)
         a.add(-1);
        return a;
    }
}

