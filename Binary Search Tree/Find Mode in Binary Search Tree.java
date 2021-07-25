https://leetcode.com/problems/find-mode-in-binary-search-tree/


class Solution {
    static HashMap<Integer, Integer> map;
    int maxCount = 1;

    int[] returnMode(HashMap<Integer, Integer> map) {
        int[] result = new int[map.size()];
        int index = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == maxCount) {
                result[index++] = key;
            }
        }

        return Arrays.copyOf(result, index);
    }

    void findMode(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null) return;

        if (map.containsKey(root.val)) {
            int freqofRoot = map.get(root.val) + 1;
            map.put(root.val, freqofRoot);
            maxCount = Math.max(maxCount, freqofRoot);
        } else {
            map.put(root.val, 1);
        }

        findMode(root.left, map);
        findMode(root.right, map);
    }

    public int[] findMode(TreeNode root) {
        map = new HashMap<Integer, Integer>();
        findMode(root, map);
        return returnMode(map);
    }
}