https://leetcode.com/problems/majority-element-ii/


//// Majority Element II


T o(n)
s o(n)


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++)
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        for(int i:h.keySet()){
             if(h.get(i)>n/3)
                 l.add(i);
        }
        return l;
    }
}
********************************************
T o(n)
s o(1)

//best**

///Majority Element II


class Solution {
   public List<Integer> majorityElement(int[] nums) {
    List<Integer> result=new ArrayList<Integer>();
    int y = 0, z = 1, cy = 0, cz = 0;
    for (int x: nums) {
      if (x==y) 
        cy++;
      else if (x==z) 
        cz++;
      else if (cy==0){
          y=x; 
          cy=1;
      }else if (cz==0){
          z=x; 
          cz=1;
      }else{ 
          cy--;
          cz--;
      }
    }
    cy = cz = 0;
    for (int x: nums){
      if (x==y) 
        cy++;
      else if (x== z) 
        cz++;
    }
    if (cy>nums.length/3) 
        result.add(y);
    if (cz>nums.length/3) 
        result.add(z);
    return result;
}
}
