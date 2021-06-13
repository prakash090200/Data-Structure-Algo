
https://practice.geeksforgeeks.org/problems/max-length-chain/1

// Max length chain

class GfG
{
    class CompareByFirstN implements Comparator<Pair>
    {
       public int compare(Pair a, Pair b)
        {
            return a.y - b.y;
        }
    }
    int maxChainLength(Pair arr[], int n)
    {
       // your code here
       Arrays.sort(arr, new CompareByFirstN());
        int index=0;
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[index].y<arr[i].x){
                count++;
                index=i;
            }
        }
        return count;
    }
}

******************************************************************
https://leetcode.com/problems/maximum-length-of-pair-chain/

public class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
        int[] dp = new int[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            int j = i - 1;
            while (j >= 0) {
                if (pairs[j][1] < pairs[i][0])
                    break;
                j--;
            }
            if (j < 0)
                dp[i] = 1;
            else
                dp[i] = dp[j] + 1;
        }
        return dp[pairs.length - 1];
    }
}