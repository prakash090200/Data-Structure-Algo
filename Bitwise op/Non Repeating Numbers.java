https://practice.geeksforgeeks.org/problems/finding-the-numbers0215/1#

// Non Repeating Numbers

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        int xor=0;
       for(int i:nums)
         xor^=i;
         int a[]=new int[2];
    int rsm=(xor & -xor);
    int x=0;
    int y=0;
    for(int i:nums){
        if((i & rsm)==0){
            x^=i;
        }
        else{
            y^=i;
        }
        
        if(x<y){
            a[0]=x;
            a[1]=y;
        }
        else{
            a[0]=y;
            a[1]=x;
        }
    }
        return a;
    }
}