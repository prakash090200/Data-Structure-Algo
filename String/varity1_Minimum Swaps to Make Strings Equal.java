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

 