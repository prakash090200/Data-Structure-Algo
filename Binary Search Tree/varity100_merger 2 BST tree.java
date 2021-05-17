https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
https://practice.geeksforgeeks.org/problems/merge-two-bst-s/1#

// Merge two BST 's


class Solution {
    List<Integer> result = new ArrayList<>();
	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		List<Integer> integers = createList(root1, root2);
		Collections.sort(integers);
		return integers;
	}

	private List<Integer> createList(TreeNode root1, TreeNode root2) {
		if (root1 == null) {
			addToList(root2);
		}
		if (root2 == null) {
			addToList(root1);
		}

		if (root1 != null && root2 != null) {
			result.add(root1.val);
			result.add(root2.val);

			createList(root1.left, root2.left);
			createList(root1.right, root2.right);
		}

		return result;
	}

	private void addToList(TreeNode node) {
		if (node != null) {
			addToList(node.left);
			result.add(node.val);
			addToList(node.right);
		}
	}
}