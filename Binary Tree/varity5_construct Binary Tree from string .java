https://www.geeksforgeeks.org/construct-binary-tree-string-bracket-representation/

https://www.codingninjas.com/codestudio/problems/binary-tree-from-bracket_1118117?leftPanelTab=2

TIME: O(N2)
SPACE :O(N)

public class Solution
{
    public static int findIndex(String str, int si, int ei)
    {
        if (si > ei)
        {
            return -1;
        }

        int c = 0;

        for (int i = si; i <= ei; i++)
        {

          
            if (str.charAt(i) == '(')
                c++;

            else if (str.charAt(i) == ')')
            {
                c--;

                if (c == 0)
                    return i;
            }
        }

        
        return -1;
    }

    public static BinaryTreeNode<Integer> treeFromBracketHelper(String str, int si, int ei)
    {
        
        if (si > ei)
        {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(str.charAt(si) - '0');

        int index = -1;

        
        if (si + 1 <= ei && str.charAt(si + 1) == '(')
        {
            index = findIndex(str, si + 1, ei);
        }

       
        if (index != -1)
        {
            
            root.left = treeFromBracketHelper(str, si + 2, index - 1);

          =
            root.right = treeFromBracketHelper(str, index + 2, ei - 1);
        }

        return root;
    }

    public static BinaryTreeNode<Integer> treeFromBracket(String str)
    {
        return treeFromBracketHelper(str, 0, str.length());
    }
}

