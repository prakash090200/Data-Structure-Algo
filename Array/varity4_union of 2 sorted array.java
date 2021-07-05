https://leetcode.com/problems/merge-sorted-array/submissions/


1st approach

--> Take a treeSet add element to it from both array it will be automatically sorted.

*****************************************************************
//2nd approach
// 2 pointers
// Merge Sorted Array  DUPLICATES ARE ALLOWED****


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        while(m>0 && n>0){
            if(nums1[m-1]>nums2[n-1]){
                nums1[m+n-1]=nums1[m-1];
                m--;
            }
            else{
                nums1[m+n-1]=nums2[n-1];
                n--;
            }
        }
        while(n>0){
            nums1[m+n-1]=nums2[n-1];
            n--;
        }
        
    }
}
**********************************************************************
//3rd approach

lass MergeTwoSorted
{
   
    public static void mergeArrays(int[] arr1, int[] arr2, int n1,
                                int n2, int[] arr3)
    {
        int i = 0, j = 0, k = 0;
     
       
        while (i<n1 && j <n2)
        {
          
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
     
        
        while (i < n1)
            arr3[k++] = arr1[i++];
     
       
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
     
    public static void main (String[] args)
    {
        int[] arr1 = {1, 3, 5, 7};
        int n1 = arr1.length;
     
        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;
     
        int[] arr3 = new int[n1+n2];
         
        mergeArrays(arr1, arr2, n1, n2, arr3);
     
        
    }
}
3rd approachdfdfdfdfdfdfdfdfdfd