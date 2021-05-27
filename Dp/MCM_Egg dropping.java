https://leetcode.com/problems/super-egg-drop/


// 887. Super Egg Drop

--> BEST***

class Solution {
    public int superEggDrop(int K, int N) {
        int lo = 1, hi = N;
        while (lo < hi) {
            int mi = (lo + hi) / 2;
            if (f(mi, K, N) < N)
                lo = mi + 1;
            else
                hi = mi;
        }

        return lo;
    }

    public int f(int x, int K, int N) {
        int ans = 0, r = 1;
        for (int i = 1; i <= K; ++i) {
            r *= x-i+1;
            r /= i;
            ans += r;
            if (ans >= N) break;
        }
        return ans;
    }
}
**************************************************************
--> MCM APPROACH


class Solution {
    Integer dp[][]=new Integer[101][10001];
    
    public int superEggDrop(int K, int N) {
      
        if(K==1)
            return N;
        
        if(N==0 || N==1)
            return N;
        
        if(dp[K][N]!=null)
            return dp[K][N];
        
        int i,l=1,h=N;
        int ans=Integer.MAX_VALUE;

        while(l<=h)
        {
            int mid=(l+h)/2;
            
            int down_temp=superEggDrop(K-1,mid-1);
            
            int up_temp=superEggDrop(K,N-mid);
            
            int temp=1+Math.max(down_temp,up_temp);
            
            
            if(down_temp<up_temp)
                l=mid+1;
            else 
                h=mid-1;
            
            ans=Math.min(temp,ans);
        }
        return dp[K][N]=ans;
    }
}