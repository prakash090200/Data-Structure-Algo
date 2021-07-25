https://www.codingninjas.com/codestudio/problems/minimum-swaps-to-convert-binary-tree-into-bst_1118109?leftPanelTab=1

https://www.geeksforgeeks.org/minimum-swap-required-convert-binary-tree-binary-search-tree/

//Minimum swap required to convert binary tree to binary search tree

import java.util.ArrayList;
import javafx.util.Pair;
import java.util.Collections;
import java.util.Comparator;

class Sortbyroll implements Comparator<Pair<Integer, Integer>> {

    public int compare(Pair<Integer, Integer> a, Pair<Integer, Integer> b) {
        return a.getKey() - b.getKey();
    }
};

public class Solution {

    public static void inorderTraversal(ArrayList<Integer> arr, ArrayList<Integer> inorder, int n, int idx) {

        // Base case.
        if (idx >= n) {
            return;
        }

        inorderTraversal(arr, inorder, n, 2 * idx + 1);
        inorder.add(arr.get(idx));
        inorderTraversal(arr, inorder, n, 2 * idx + 2);

    }

    public static void swap(ArrayList<Pair<Integer, Integer>> toSwap, int i, int j) {

        Pair<Integer, Integer> a = toSwap.get(i);
        toSwap.set(i, toSwap.get(j));
        toSwap.set(j, a);

    }

    public static int minimumSwaps(ArrayList<Integer> arr, int n) {
        // Finding the inorder.
        ArrayList<Integer> inorder = new ArrayList<>();

        inorderTraversal(arr, inorder, n, 0);
        int ans = 0;
        ArrayList<Pair<Integer, Integer>> toSwap = new ArrayList<Pair<Integer, Integer>>();

        for (int i = 0; i < n; i++) {
            toSwap.add(new Pair<Integer, Integer>(inorder.get(i), i));
        }

        Collections.sort(toSwap, new Sortbyroll());

        for (int i = 0; i < n; i++) {
            if (i == toSwap.get(i).getValue()) {
                continue;
            }

            else {
                swap(toSwap, i, toSwap.get(i).getValue());
            }

            if (toSwap.get(i).getValue() != i) {
                --i;
            }
            ans++;
        }

        return ans;

    }

}