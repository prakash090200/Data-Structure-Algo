https://leetcode.com/problems/intersection-of-two-arrays/solution/

https://leetcode.com/problems/intersection-of-two-arrays-ii/
************************************
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h=new HashMap<>();
      ArrayList<Integer> ar=new ArrayList<>();
       
        int k=0;
        for(int val:nums1){
            if(h.containsKey(val))
                 h.put(val,h.get(val)+1);
            else
                h.put(val,1);
        }
        
        for(int val:nums2){
            if(h.containsKey(val)){
              ar.add(val);
            if(h.get(val)>1)
                h.put(val,h.get(val)-1);
            else
                h.remove(val);
            }
        }
        int[] a=new int[ar.size()];
        for(int i=0;i<ar.size();i++)
            a[k++]=ar.get(i);
        return a;
    }
}
**********************************************************

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h=new HashMap<>();
      ArrayList<Integer> ar=new ArrayList<>();
       
        int k=0;
        for(int val:nums1){
            if(h.containsKey(val))
                 h.put(val,h.get(val)+1);
            else
                h.put(val,1);
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


                            OR

class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<Integer>();
    for (Integer n : nums1) set1.add(n);
    HashSet<Integer> set2 = new HashSet<Integer>();
    for (Integer n : nums2) set2.add(n);

    set1.retainAll(set2);    //////// ((VERY IMP))

    int [] output = new int[set1.size()];
    int idx = 0;
    for (int s : set1) output[idx++] = s;
    return output;
  }
}