https://www.geeksforgeeks.org/maximum-subsequence-sum-such-that-no-three-are-consecutive/

//Maximum subsequence sum such that no three are consecutive

class GFG
{
static int arr[] = {100, 1000, 100, 1000, 1};
static int sum[] = new int[10000];
 

static int maxSumWO3Consec(int n)
{
    if(sum[n] != -1)
        return sum[n];
     
    if(n == 0)
        return sum[n] = 0;
     
    if(n == 1)
        return sum[n] = arr[0];
     
    if(n == 2)
        return sum[n] = arr[1] + arr[0];
     
    
    return sum[n] = Math.max(Math.max(maxSumWO3Consec(n - 1),
                    maxSumWO3Consec(n - 2) + arr[n]),
                    arr[n] + arr[n - 1] + maxSumWO3Consec(n - 3));
     
     
}
 

public static void main(String[] args)
{
    int n = arr.length;
        Arrays.fill(sum, -1);
    System.out.println(maxSumWO3Consec(n));
}
}