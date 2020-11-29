///Height of Binary Tree 

class Solution {
    int height(Node node) {
        Node temp=node;

        if(node==null)
        return 0;

        int lheight=height(temp.left);
        int rheight=height(temp.right);

        if(lheight>rheight)
        return lheight+1;
        else
        return rheight+1;
    }
}
