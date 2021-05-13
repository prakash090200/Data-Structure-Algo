https://leetcode.com/problems/find-duplicate-subtrees/submissions/

// Find Duplicate Subtrees NODES

class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        findDuplicates(root, result, map);
        return result;
    }
    
    private StringBuilder findDuplicates(TreeNode root, List<TreeNode> list, 
                                  Map<Integer, Integer> map) {
        
       if (root == null) return new StringBuilder();
        
       StringBuilder key = findDuplicates(root.left, list, map).
            append(".").append(findDuplicates(root.right, list, map)).
            append(".").append(root.val);
        
       int hash = key.toString().hashCode();
       int count=(map.get(hash)!=null)?map.get(hash):1;
        
            
        if (count == 2) {

            list.add(root);
        }

        map.put(hash, count + 1);
        
        return key;
    }
}



*****************************************************************
https://practice.geeksforgeeks.org/problems/duplicate-subtrees/1#


class Solution {
    HashMap<String, Integer> map = new HashMap<>();
    List<Integer> res = new LinkedList<>();
    String inorder(Node root){
        if( root == null ){
            return "";
        }
        String str = "(";
        
        str += inorder(root.left);
        str += root.data +"";
        str += inorder(root.right);

        str+=")";
        if( map.get(str) != null && map.get(str) == 1 ){
            res.add(root.data);
        }
        if( map.containsKey(str) ){
            map.put(str, map.get(str)+1);
        } else{
            map.put(str, 1);
        }
        return str;
    }   
    public void printDup(Node root){
        inorder(root);
        Collections.sort(res);
        //System.out.println(res);
        
        if( res.size() == 0 ){
            System.out.print(-1);
        }
        for( int i : res){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}