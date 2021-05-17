https://www.geeksforgeeks.org/flatten-bst-to-sorted-list-decreasing-order/



//Flatten BST to sorted list | Decreasing order




static  node prev;
static void revInorder(node curr)
{

  if (curr == null)
    return;
  revInorder(curr.right);
  prev.left = null;
  prev.right = curr;
  prev = curr;
  revInorder(curr.left);
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