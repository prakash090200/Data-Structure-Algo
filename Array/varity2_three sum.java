https://leetcode.com/problems/3sum/

//3sum

class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -1 ; i++){
            
            if(nums[i] > 0){
                break;
            }else if(i > 0 && nums[i] == nums[i-1]){
                continue;
            } 
                
            int low = i + 1, high = nums.length -1;
            while(low < high){
                    
                if (nums[i] + nums[low] + nums[high] < 0){
                    low++;
                }else if (nums[i] + nums[low] + nums[high] > 0){
                    high--;
                }else{
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));  
                    high--;
                    low++;
                    while(low < high && nums[low] == nums[low-1]) low++;
                    while(low < high && nums[high] == nums[high+1]) high--;
                    
                }
                
            }
        }
        return result;    
    }

}
*****************************************************

or



class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList();
        List<Integer> l;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -2 ; i++){
            
            if(nums[i] > 0){
                break;
            }else if(i > 0 && nums[i] == nums[i-1]){
                continue;
            } 
                
            int low = i + 1, high = nums.length -1;
            while(low < high){
                    
                if (nums[i] + nums[low] + nums[high] < 0){
                    low++;
                }else if (nums[i] + nums[low] + nums[high] > 0){
                    high--;
                }else{
                    l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[low]);
                    l.add(nums[high]);
                    
                    if(!result.contains(l))
                    result.add(l);  
                    high--;
                    low++;
                   
                    
                }
                
            }
        }
        return result;    
    }

}
