https://practice.geeksforgeeks.org/problems/count-total-set-bits-1587115620/1


///Count total set bits


class CountBits{
    public static int countSetBits(int t){
        if(t==0) return 0;
        int x=xvalue(t);
   
        int cal2x=(1<<(x-1))*x;
       
        int most2x=t-(1<<x)+1;
      
        int rest=t-(1<<x);
      
        int ans=cal2x+most2x+countSetBits(rest);
        return ans;
    }

    public static int xvalue(int t){
        int i=0;
        while((1<<i) <=t){
            i++;
        }
        return i-1;
    }
}
