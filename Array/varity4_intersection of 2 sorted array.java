https://leetcode.com/problems/intersection-of-two-arrays/solution/

https://leetcode.com/problems/intersection-of-two-arrays-ii/
************************************
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h=new HashMap<>();
      ArrayList<Integer> ar=new ArrayList<>();
       
        int k=0;
        for(int val:nums1){
            h.put(val,h.getOrDefault(val,0)+1);
        }
        for(int val:nums2){
            if(h.containsKey(val))
              ar.add(val);
            h.remove(val);
        }
        int[] a=new int[ar.size()];
        for(int i=0;i<ar.size();i++)
            a[k++]=ar.get(i);
        return a;
    }
}
**********************************************************
static void printIntersection(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j] + " ");
                j++;
                i++;
            }
        }
    }
***********************************************
                            O}