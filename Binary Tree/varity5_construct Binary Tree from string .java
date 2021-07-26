https://www.geeksforgeeks.org/construct-binary-tree-string-bracket-representation/

https://www.codingninjas.com/codestudio/problems/binary-tree-from-bracket_1118117?leftPanelTab=2

TIME: O(N2)
SPACE :O(N)

public class Solution
{
    public static BinaryTreeNode<Integer> treeFromBracket(String str)
    {
     
        BinaryTreeNode ans= treeFromString(str,0, str.length() - 1);
        return ans;
    }
static int findIndex(String str, int si, int ei)
  {
    if (si > ei)
      return -1;

    Stack<Character> s = new Stack<Character>();
    for (int i = si; i <= ei; i++)
    {
 
     
      if (str.charAt(i) == '(')
        s.add(str.charAt(i));
 
      
      else if (str.charAt(i) == ')')
      {
        if (s.peek() == '(')
        {
          s.pop();
 
          
          if (s.isEmpty())
            return i;
         }
       }
   }
 
    
  return -1;
  }
 
  
  static BinaryTreeNode treeFromString(String str, int si, int ei)
  {
 
    if (si > ei)
      return null;
 
    
    BinaryTreeNode root = new BinaryTreeNode(str.charAt(si) - '0');
    int index = -1;
 
    
    if (si + 1 <= ei && str.charAt(si+1) == '(')
      index = findIndex(str, si + 1, ei);
 
    
    if (index != -1)
    {
      root.left = treeFromString(str, si + 2, index - 1);
      root.right = treeFromString(str, index + 2, ei - 1);
    }

    return root;
  }
}
