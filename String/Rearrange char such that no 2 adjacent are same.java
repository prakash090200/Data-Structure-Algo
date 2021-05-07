https://leetcode.com/problems/reorganize-string/

// Rearrange characters in a string such that no two adjacent are same


class Solution {
    public String reorganizeString(String S) {
        int[] ascii = new int[127];
        for (char c : S.toCharArray()) ascii[c]++;

        Queue<int[]> maxHeap = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] > 0) {
                maxHeap.add(new int[]{i, ascii[i]});
            }
        }

        StringBuilder result = new StringBuilder();
        while (maxHeap.size() >= 2) {
            int[] curr = maxHeap.remove();
            int[] next = maxHeap.remove();

            result.append((char) curr[0]);
            result.append((char) next[0]);

            if (curr[1] > 1) {
                maxHeap.add(new int[]{curr[0], curr[1] - 1});
            }

            if (next[1] > 1) {
                maxHeap.add(new int[]{next[0], next[1] - 1});
            }
        }

        if (!maxHeap.isEmpty()) {
            int[] curr = maxHeap.remove();
            if (curr[1] > 1) {
                return "";
            }

            result.append((char) curr[0]);
        }

        return result.toString();
    }
}