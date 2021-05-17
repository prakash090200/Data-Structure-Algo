/////Count Leaves in Binary Tree

class Tree
{
    int countLeaves(Node node) 
    {
         if(node==null)
         return 0;

         if(node.left==null && node.right==null)
         return 1;

         int count=0;
        count+=countLeaves(node.left);
         count+=countLeaves(node.right);
         return count;
         
    }
}
