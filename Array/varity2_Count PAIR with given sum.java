///Count pairs with given sum

https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1#


class Solution {
    int getPairsCount(int[] arr, int n, int k) 
    {
        // code here
        int count=0;
        if(n==1)
        return 0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
           
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<n;i++)
        {
           if(map.containsKey(k-arr[i]))
           count+=map.get(k-arr[i]);
           if(k-arr[i]==arr[i])
           count--;
        }
    
        return count/2;
    }
}
