https://www.codingninjas.com/codestudio/problems/k-sum-path-in-a-binary-tree_893543
https://www.geeksforgeeks.org/print-k-sum-paths-binary-tree/


/// Print all k-sum paths in a binary tree

TIME: O(N2)
SPACE: O(N)


public class Solution {
	public static ArrayList<ArrayList<Integer>> kPathSum(BinaryTreeNode<Integer> root, int k) {
		ArrayList<Integer> path = new ArrayList<>();
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		kPathSumHelper(root, path, answer, k);
		return answer;
	}

	private static void kPathSumHelper(BinaryTreeNode<Integer> root, ArrayList<Integer> path,
			ArrayList<ArrayList<Integer>> answer, int k) {
		if (root == null) {
			return;
		}
		path.add(root.data);
		
		kPathSumHelper(root.left, path, answer, k);
		
		kPathSumHelper(root.right, path, answer, k);

		int sum = 0;

		
		for (int i = path.size() - 1; i >= 0; i--) {
			ArrayList<Integer> temp = new ArrayList<>();
			sum += path.get(i);

			
			if (sum == k) {
				for (int j = i; j < path.size(); j++) {
					temp.add(path.get(j));
				}
				answer.add(temp);
			}
		}
		
		path.remove(path.size() - 1);
	}

}
