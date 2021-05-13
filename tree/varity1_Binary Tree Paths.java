https://leetcode.com/problems/binary-tree-paths/


/// 257. Binary Tree Paths


class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        String path = "";
        dfs(root, paths, path);
        return paths;
    }
    
    private void dfs(TreeNode node, List<String> paths, String path) {
        if (!path.isEmpty()) {
            path = path + "->";
        }
        path = path + String.valueOf(node.val);
        
        if (node.left == null && node.right == null) {
            paths.add(path);
        } else if (node.left == null) {
            dfs(node.right, paths, path);
        } else if (node.right == null) {
            dfs(node.left, paths, path);
        } else {
            dfs(node.left, paths, path);
            dfs(node.right, paths, path);
        }
    }
}