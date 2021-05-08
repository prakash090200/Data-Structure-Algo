https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1

///Median in a row-wise sorted Matrix


class Solution {
    int median(int matrix[][], int r, int c) {
        int[] arr=new int[r*c];
        int m=r*c/2;
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[k]=matrix[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        return arr[m];       
    }
}
*****************************************************

BEST******

class Solution {
    int median(int m[][], int r, int c) {
       int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
          
        for(int i=0; i<r ; i++)
        {
              
           
            if(m[i][0] < min)
                min = m[i][0];
            
            if(m[i][c-1] > max)
                max = m[i][c-1];
        }
          
        int desired = (r * c + 1) / 2;
        while(min < max)
        {
            int mid = min + (max - min) / 2;
            int place = 0;
            int get = 0;
              
            // Find count of elements smaller than mid
            for(int i = 0; i < r; ++i)
            {
                  
                get = Arrays.binarySearch(m[i],mid);
                  
                
                if(get < 0)
                    get = Math.abs(get) - 1;
                  
                
                else
                {
                    while(get < m[i].length && m[i][get] == mid)
                        get += 1;
                }
                  
                place = place + get;
            }
              
            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }   
    }
