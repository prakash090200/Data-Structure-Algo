https://leetcode.com/problems/path-sum-ii/

//113. Path Sum II


class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return result;
        List<Integer> paths=new ArrayList<>();
        helper(paths,root,targetSum);
        return result;
    }
    public void helper(List<Integer> paths,TreeNode root,int targetSum){
        if(root==null) return;
        paths.add(root.val);
        if(root.left==null && root.right==null && root.val == targetSum){
            result.add(new ArrayList<>(paths));
        }
        else{
            helper(paths,root.left,targetSum-root.val);
            helper(paths,root.right,targetSum-root.val);
        }
        paths.remove(paths.size()-1);
    }
}

********************************************************


class Solution {
    List<List<Integer>> result=new ArrayList<>();
    List<Integer> paths=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return result;
        
        helper(root,targetSum);
        return result;
    }
    public void helper(TreeNode root,int targetSum){
        if(root==null) return;
        paths.add(root.val);
        if(root.left==null && root.right==null && root.val == targetSum){
            result.add(new ArrayList<>(paths));
        }
        else{
            helper(root.left,targetSum-root.val);
            helper(root.right,targetSum-root.val);
        }
        paths.remove(paths.size()-1);
    }
}