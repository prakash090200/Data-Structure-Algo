https://practice.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1#

///Max and min element in Binary Tree 


class GFG
{
	public static int findMax(Node node)
	{
	    if (node == null)
            return Integer.MIN_VALUE;
  
        int res = node.data;
        int lres = findMax(node.left);
        int rres = findMax(node.right);
  
        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
	}
	public static int findMin(Node node)
	{
	     if (node == null)
        return Integer.MAX_VALUE;
  
    int res = node.data;
    int lres = findMin(node.left);
    int rres = findMin(node.right);
  
    if (lres < res)
        res = lres;
    if (rres < res)
        res = rres;
    return res;
	}
}