https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int j=0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                if(i!=j){
                    int temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
                j++;
          }
            
      }
        return A;
    }
}