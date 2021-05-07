https://leetcode.com/problems/minimum-swaps-to-make-strings-equal/submissions/

//Minimum Swaps to Make Strings Equal


class Solution {
    public int minimumSwap(String s, String s1) {
        int x=0,y=0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)!=s1.charAt(i)){
                if(s.charAt(i)=='x')x++;
                else y++;
            }
        }
        if(x%2==0 && y%2==0)return (x+y)/2;
        else  if(x%2==1 && y%2==1)return (x+y)/2 +1;
        return -1;
    }
}

*********************************************

BEST*****


class Solution {
    public int minimumSwap(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
		// validate the input
        if (n != m) {
            return -1;
        }
        
        int xmis = 0;  
        int ymis = 0;  
        

        for (int i = n-1; i >= 0; i--) {
            if (s1.charAt(i) == 'x' && s2.charAt(i) == 'y') {
                xmis++;
            } else if (s1.charAt(i) == 'y' && s2.charAt(i) == 'x') {
                ymis++;
            }
        }
        

        if (xmis % 2 != ymis % 2) {
            return -1;
        }
        
        int ans = xmis / 2 + ymis / 2; 
        if (xmis % 2 == 1) {
            ans += 2; 
        }
        
        return ans;
    }
}