https://leetcode.com/problems/majority-element/

/// Majority Element

T o(n)
S o(n)

class Solution {
    public int majorityElement(int[] nums) {
     HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        int ans=-100;
        for(int i=0;i<n;i++)
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        for(int i:h.keySet()){
             if(h.get(i)>n/2)
                 ans=i;
        }
        return ans;
    }
}

**************************************************************
//best**

T o(n)
S o(1)

class Solution {
    public int majorityElement(int[] nums) {
     int y = 0, z = 1, cy = 0, cz = 0;
        int ans=0;
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
    if (cy>nums.length/2) 
        ans=y;
    if (cz>nums.length/2) 
        ans=z;
        return ans;
    }
}