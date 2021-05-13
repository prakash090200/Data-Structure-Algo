https://leetcode.com/problems/most-frequent-subtree-sum/

//Most Frequent Subtree Sum

class Solution
{
Map<Integer,Integer> sumMap = new HashMap<>();
	List<Integer> rootList= new ArrayList<>();
	int maxOccurence=0;
	public int[] findFrequentTreeSum(TreeNode root) {
		if(root==null)
			return new int[0];

		findSumOfSubtrees(root);
		int[] sumArray = new int[rootList.size()];
		for(int i=0;i<rootList.size();i++){
			sumArray[i]=rootList.get(i);
		}
		return sumArray;
	}

	public int findSumOfSubtrees(TreeNode root){
		if(root==null)
			return 0;

		int sum = root.val+findSumOfSubtrees(root.left)+findSumOfSubtrees(root.right);
		int count = 1;
		if(sumMap.containsKey(sum)){
			count = sumMap.get(sum);
			count++;
			sumMap.put(sum,count);
		}
		else{
			sumMap.put(sum,1);
		}
		if(count>maxOccurence){
			maxOccurence=count;
			rootList.clear();
			rootList.add(sum);
		}
		else if(count==maxOccurence){
			rootList.add(sum);
		}
		return sum;
	}
}