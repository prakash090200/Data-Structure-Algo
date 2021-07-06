https://practice.geeksforgeeks.org/problems/find-the-median0527/1

//Find the median

class Solution
{
    public int find_fact(int[] v)
    {
         Arrays.sort(v);
        
       int mid=v.length/2;
       if(v.length%2==0)
           return (v[mid]+v[mid-1])/2;
           else
           return v[mid];
    }
}

