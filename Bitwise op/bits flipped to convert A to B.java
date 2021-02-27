https://practice.geeksforgeeks.org/problems/bit-difference-1587115620/1
// Function to find number of bits needed to be flipped to convert A to B

class CountBitFlip{
   
    public static int countBitsFlip(int a, int b){
        
       int x=a ^ b;
        int count=0;
        while(x!=0){
            int rsm=x & -x;
           x-=rsm;
           count++;
        }
       return count; 
    }
    
    
}