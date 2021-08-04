https://practice.geeksforgeeks.org/problems/duplicate-subtree-in-binary-tree/1#


//Duplicate subtree in Binary Tree


class Solution {
        int ans=0;
        Map<Integer, Integer> map = new HashMap<>();

    int dupSub(Node root) {
      
        findDuplicates(root);
        
       return ans;
    }
   
 
    public StringBuilder findDuplicates(Node root) {
        
       if (root == null) 
       return new StringBuilder();
        
        StringBuilder key = findDuplicates(root.left).
            append(".").append(findDuplicates(root.right)).
            append(".").append(root.data);
        
       int hash = key.toString().hashCode();
       
       
     if(map.containsKey(hash)){
         if(root.left!=null && root.right!=null)
         ans=1;
     }
       else 
       map.put(hash,1);
     
        
        return key;
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