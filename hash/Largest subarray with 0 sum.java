class GfG
{  // Largest subarray with 0 sum
    int maxLen(int arr[], int n)
    {  
        int sum=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        //int res=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0)
                count=Math.max(count,i+1);
            else if(!h.containsKey(sum)){
                h.put(sum,i);
            }
            else
            count=Math.max(count,i-h.get(sum));
        }
        return count;
    }
}