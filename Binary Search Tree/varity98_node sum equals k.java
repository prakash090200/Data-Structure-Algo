https://leetcode.com/problems/two-sum-iv-input-is-a-bst/submissions/

///653. Two Sum IV - Input is a BST


class Solution {
    HashMap<Integer, Integer> hm=new HashMap<>();
    public boolean findTarget(TreeNode root, int k) 
    {
       
       if(root==null) return false;
       
       if(!hm.containsKey(k-root.val))
       {
           hm.put(root.val,1);
       }
       else return true;
       return  findTarget(root.left, k) || findTarget(root.right,k);
       
       
        
    }
}

******************************************************************

class Solution {
    int idx;
int[] arr;

// O(n) O(n)
public boolean findTarget(TreeNode root, int k) {

	idx = 0;
	arr = new int[10001];
	inorder(root);

	int lo = 0, hi = idx - 1;
	while (lo < hi) {
		int sum = arr[lo] + arr[hi];
		if (sum == k)
			return true;
		else if (sum > k)
			hi--;
		else
			lo++;
	}

	return false;
}

// O(n) O(n)
public void inorder(TreeNode root) {

	if (root == null)
		return;

	inorder(root.left);
	arr[idx++] = root.val;
	inorder(root.right);
}
}