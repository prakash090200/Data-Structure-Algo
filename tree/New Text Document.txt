//// Check for BST

public class Tree
{
    boolean isBST(Node root)
        {
            return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
    boolean check(Node root,int min,int max){
        if(root==null)
            return true;
        return root.data>min && root.data<max && check(root.left,min,root.data) && check(root.right,root.data,max);
}
}


************************************************************************************

//// Check for BST

public class Tree
{
    boolean isBST(Node root)
        {
            return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
    boolean check(Node root,int min,int max){
        if(root==null)
            return true;
        boolean flag=false;
        if(root.data>min && root.data<max){
           
          if(check(root.left,min,root.data) && check(root.right,root.data,max))
           flag=true;
         
    }
    
    return flag;
}
}
