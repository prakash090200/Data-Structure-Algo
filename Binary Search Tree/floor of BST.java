
https://ide.geeksforgeeks.org/wW0hi8DTY0

public static Node floor(Node root, int x){
        Node res=null;
        while(root!=null){
            if(root.key==x)
                return root;
            else if(root.key>x)
                root=root.left;
            else{
                res=root;
                root=root.right;
            }
        }
        return res;
    } 