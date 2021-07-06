
https://leetcode.com/problems/permutations/


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums, result, new ArrayList<>()); 
        return result;                


        
    }
    private void backtracking(int[] nums, List<List<Integer>> result, ArrayList<Integer> answer) {
        if(answer.size() == nums.length) {
            result.add(new ArrayList(answer));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(answer.contains(nums[i]))
                continue;
            answer.add(nums[i]);
            backtracking(nums, result, answer);
            answer.remove(answer.size()-1);
        }
    }
}