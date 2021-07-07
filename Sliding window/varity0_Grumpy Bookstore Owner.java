https://leetcode.com/problems/grumpy-bookstore-owner/submissions/

//Grumpy Bookstore Owner
// sliding window
// catogry 3
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        
        int i=0;
        int count_cust=0;
        int max_cust=0;
        int cust=0;
          for(int j=0;j<customers.length;j++){
           
            if(grumpy[j]==1)
                count_cust+=customers[j];
            else
                cust+=customers[j];
            
              
            if(j+1-i==X){
                if(count_cust>max_cust){
                 
                    max_cust=count_cust;
                }
                if(grumpy[i]==1)
                    count_cust -= customers[i];
                i++;
            }
            
        }
     
        
        return cust+max_cust;
    }
}