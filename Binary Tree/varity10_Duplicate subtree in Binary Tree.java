https://practice.geeksforgeeks.org/problems/duplicate-subtree-in-binary-tree/1#


//Duplicate subtree in Binary Tree

class Solution {

    int dupSub(Node root) {
       List<Node> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        findDuplicates(root, result, map);
        
       return (result.size()>0)?1:0;
    }
   
 
    public StringBuilder findDuplicates(Node root, List<Node> list, Map<Integer, Integer> map) {
        
       if (root == null) return new StringBuilder();
        
       StringBuilder key = findDuplicates(root.left, list, map).
            append(".").append(findDuplicates(root.right, list, map)).
            append(".").append(root.data);
        
       int hash = key.toString().hashCode();
       int count=(map.get(hash)!=null)?map.get(hash):1;
        
            
        if (count == 2) {
           if(root.left!=null && root.right!=null)
            list.add(root);
        }

        map.put(hash, count + 1);
        
        return key;
    }

    
}
*******************************************************************

class Solution {
    static char MARKER = '$';
    int dupSub(Node root) {
      HashSet<String> subtrees=new HashSet<>();
        return dupSubUtil(root,subtrees)==""?1:0;
    }
   
 
    public static String dupSubUtil(Node root, HashSet<String> subtrees)
    {
        String s = "";
     
     
        if (root == null)
            return s + MARKER;
     
        
        String lStr = dupSubUtil(root.left,subtrees);
        if (lStr.equals(s))
            return s;
     
       
        String rStr = dupSubUtil(root.right,subtrees);
        if (rStr.equals(s))
            return s;
     
    
        s = s + root.data + lStr + rStr;
     
       
        if (s.length() > 3 && subtrees.contains(s))
            return "";
     
        subtrees.add(s);
        return s;
    }

}