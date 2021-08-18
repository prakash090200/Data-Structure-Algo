https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1


class Solution
{
    
    public static long findSum(String str)
    {   
        long sum=0;
        String s="0"; 
        int n=str.length();
        char c='\0';
        for(int i=0;i<n;i++){
            c=str.charAt(i);
            if(Character.isDigit(c))
                s+=c;
            
            else{
                sum+=Long.parseLong(s);
                s="0";
            }
            
        }
        return  sum+Long.parseLong(s);
    }
    
}