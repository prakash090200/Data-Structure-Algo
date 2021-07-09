
https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/submissions/

utube   ---- > https://www.youtube.com/watch?v=dpsp1hP6P-U&t=479s&ab_channel=ArtificialMinds

/// Kth smallest element in a row-cpumn wise sorted matrix



Approach 1:
In a arrayList copy all the element of the 2d arrray and sort it

get the k-1 index 

time: o(n*m*log(m*n))
space: o(n)

******************************************

Approach 2:
time:o(n*m)
space:o(1)

//Best***
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r = matrix.length, c = matrix[0].length;
        int low = matrix[0][0], high = matrix[r - 1][c - 1];
        while (low < high) {
            int mid = (high+low)/2;
            int count = 0; 
            int j = c - 1;
            
            for (int i = 0; i < r; i++) {
               
                while (j >= 0 && matrix[i][j] >mid)
                    j--;
                count += j + 1;
            }
           
            if (count < k)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}

********************************************************************

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r = matrix.length, c = matrix[0].length;
        int low = matrix[0][0], high = matrix[r - 1][c - 1];
        while (low < high) {
            int mid = (high+ low)/2;
            int place = 0;
            int get = 0;

// for finding the count of elements <= mid

            for(int i = 0; i < r; ++i)
            {
                 
                get = Arrays.binarySearch(matrix[i],mid);
              
                if(get < 0)
                    get = Math.abs(get) - 1;
                 
               
                else
                {
                    while(get < matrix[i].length && matrix[i][get] == mid)
                        get += 1;
                }
                 
                place = place + get;
            }
           
            if (place < k)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}

*************************************************************

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                pq.add(matrix[i][j]);
                if(pq.size()>k)
                {
                    pq.poll();
                }
            }
        }
        return pq.peek();
    }
}







