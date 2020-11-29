///Left View of Binary Tree 

class Tree
{
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> a=new ArrayList<>();
      Node temp=root;
      if(temp==null)
      return a;
      
      a.add(temp.data);
      
      while(temp.left!=null){
          a.add(temp.left.data);
          temp=temp.left;
      }
      if(temp.right!=null)
        a.addAll(leftView(temp.right));
      return a;
    }
    
}