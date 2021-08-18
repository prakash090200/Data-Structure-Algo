https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1#


o(N3)
o(1)

class Solution{
    static String longestPalin(String s){
        
        if(s.length()==0)return new String();
        int n=s.length();
        int start=0;
        int maxlen=0;
        int low=0;
        int high=0;
        for(int i=1;i<n;i++){
            low=i-1;
            high=i;
            while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
                if(high-low+1>maxlen){
                    start=low;
                    maxlen=high-low+1;
                }
                
                low--;
                high++;
            }
            
            low=i-1;
            high=i+1;
             while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
                if(high-low+1>maxlen){
                    start=low;
                    maxlen=high-low+1;
                }
                
                low--;
                high++;
            }
        }
        if(maxlen!=0){
            int k=start+maxlen;
            return s.substring(start,k);
        }
        
        return new String(s.charAt(0)+"");
        
        
    }
}

*************************************************************

//DP
O(n2)
o(n2)

class Solution{
    static String longestPalin(String s){
        int n=s.length();
        int maxlen=1;
        int start=0;
        boolean dp[][]=new boolean[n][n];
        //1
        for(int i=0;i<n;i++)
            dp[i][i]=true;
        
        //2
        for(int i=0;i<n-1;i++){
           if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                if(maxlen<2){
                start=i;
                maxlen=2;
                }
           }
        }
        
        for(int k=3;k<=n;k++){
            for(int i=0;i<n-k+1;i++){
                int j=i+k-1;
                if(dp[i+1][j-1] && s.charAt(i)==s.charAt(j)){
                    dp[i][j]=true;
                    if(k>maxlen){
                        start=i;
                        maxlen=k;
                    }
                }
            }
        }
        if(maxlen>1)
            return s.substring(start,start+maxlen);
        
        else
        return (s.charAt(0)+"");
    }
}