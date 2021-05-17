https://www.geeksforgeeks.org/flatten-bst-to-sorted-list-increasing-order/

//Flatten BST to sorted list | Increasing order

static  node prev;
static void Inorder(node curr)
{

  if (curr == null)
    return;
  revInorder(curr.left);
  prev.left = null;
  prev.right = curr;
  prev = curr;
 Inorder(curr.right);
}

static node flatten(node parent)
{
  
  node dummy = new node(-1);
 

  prev = dummy;
 

  revInorder(parent);
 
  prev.left = null;
  prev.right = null;
  node ret = dummy.right;

  return ret;
}