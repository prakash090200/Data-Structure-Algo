https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1#

//Predecessor and Successor


class GfG
{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       if (root == null)
        return;
 

    if (root.data == key)
    {
         
      
        if (root.left != null)
        {
            Node tmp = root.left;
            while (tmp.right != null)
                tmp = tmp.right;
                 
            p.pre = tmp;
        }
 
        
        if (root.right != null)
        {
            Node tmp = root.right;
             
            while (tmp.left != null)
                tmp = tmp.left;
                 
            s.succ = tmp;
        }
        
    }
 

    else if (root.data > key)
    {
        s.succ = root;
        findPreSuc(root.left,p,s ,key);
    }
 
    else
    {
        p.pre = root;
        findPreSuc(root.right, p,s,key);
    }
    }
}