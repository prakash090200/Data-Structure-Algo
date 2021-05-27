https://practice.geeksforgeeks.org/problems/painting-the-fence3727/1#submission


//Painting the Fence 


class Solution
{
    long countWays(int n,int k)
    {
        if(n == 1) return k ;
        
        long v1 = k ;
        long v2 = k * (k-1) ;
        long total = v1+v2 ;
        
        for(int i = 3 ; i <= n ; i++){
            v1 = v2 ;
            v2 = (total * (k-1)) % 1000000007 ;
            total = (v1+v2) % 1000000007 ;
        }
        return total ;
    }
}