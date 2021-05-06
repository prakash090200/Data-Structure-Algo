https://practice.geeksforgeeks.org/problems/31272eef104840f7430ad9fd1d43b434a4b9596b/1/
////Search Pattern (Rabin-Karp Algorithm)

T(c)=O(n+m)  -> best case
O(nm)   --> worst case when both string are same (eg: s1=AAAAAAAA  s2=AAA)  

space o(1)


class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        int m = pat.length(), n = S.length();
        int d = 256;
        int q = 101;
        int h = 1, t = 0, p = 0;
        ArrayList<Integer> res = new ArrayList<>(); 
        for(int i=1; i<m; i++)
        h = (h*d)%q;
        for(int i=0; i<m; i++)
        {
            t = (t*d + S.charAt(i))%q;
            p = (p*d + pat.charAt(i))%q;
        }
        for(int i=0; i<n-m+1; i++)
        {
            if(t == p)
            {
                int j = 0;
                for(j=0; j<m; j++)
                if(S.charAt(i+j) != pat.charAt(j))
                break;
                if(j == m)
                res.add(i+1);
            }
            if(i < n-m)
            {
                t = (d*(t - h*S.charAt(i)) + S.charAt(i+m))%q;
                if(t < 0) t += q;
            }
        }
        if(res.size() == 0) res.add(-1);
        return res;
    }
}

*********************************************************
class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        
        ArrayList<Integer> ar=new ArrayList<Integer>();
        
        for(int i=0;i<S.length();i++){
            
            char c=S.charAt(i);
            int k=i;
            int f=0;
            char st=pat.charAt(0);
            while(c==st&&k<S.length()&&f<pat.length())
            { k++;
                f++;
               if( k<S.length()&&f<pat.length())
                {c=S.charAt(k);
                st=pat.charAt(f);}
               else
               break;
            }
            
            if(f==pat.length())
                ar.add(i+1);
        }
        
        if(ar.size()==0)
        ar.add(-1);
        return ar;
    }
}