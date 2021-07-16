https://leetcode.com/problems/path-sum-iii/

/// 437. Path Sum III

TIME: O(N2)
SPACE: O(N)

class Solution {
    int Count = 0;
    List<Integer> ar = new ArrayList<>();
    public int pathSum(TreeNode root, int targetSum) {
        check(root, targetSum);
        return Count;
    }
    
    private void check(TreeNode cur, int targetSum) {
        if (cur == null)
            return;
        
        
        ar.add(cur.val);
        
        
        int pathSum = 0;
        for (int i = ar.size() - 1; i >= 0; i--) {
            pathSum += ar.get(i);
            
            if (pathSum == targetSum) {
                Count++;
            }
        }
        
       
        check(cur.left, targetSum);
        check(cur.right, targetSum);
        
        ar.remove(ar.size() - 1);
    }
}
*******************************************************************


TIME: O(N2)
SPACE: O(N)

class Solution {
    int count = 0;
    public int pathSum(TreeNode root, int target) {
        outerDFS(root,target);
        return count;
    }
    
    private void outerDFS(TreeNode root,int target){
        if (root == null) return;
            innerDFS(root,target,0);
            outerDFS(root.left,target);
            outerDFS(root.right,target);
        
    }
    
    private void innerDFS(TreeNode root,int target,int currSum){
        if (root == null) return;
            currSum += root.val;
            if (currSum == target) 
                count++;
            innerDFS(root.left,target,currSum);
            innerDFS(root.right,target,currSum);
        
    }
}


***************************************************************

TIME: O(N)
SPACE: O(N)

best****


class Solution {
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    public int pathSum(TreeNode root, int sum) {
        preorder(root, sum, 0);
        return count;
    }
    
    private void preorder(TreeNode root, int target, int currSum) {    
        if(root == null) return;
        
            currSum += root.val;
            if(currSum == target) count++;   
        
            if (map.containsKey(currSum - target)) 
                count += map.get(currSum - target);
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
			
            preorder(root.left, target, currSum);
            preorder(root.right, target, currSum);
            
            map.put(currSum, map.get(currSum) - 1);
        
    }
}