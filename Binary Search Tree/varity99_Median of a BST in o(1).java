https://practice.geeksforgeeks.org/problems/median-of-bst/1#

// Median of BST 

TIME: O(N)
SPACE: O(N)

class Tree
{
    static List<Integer> arr = new ArrayList<>();
    static int cnt = 0;
    public static void inorder(Node root)
    {
        if(root != null)
        {
        inorder(root.left);
        arr.add(root.data);
        cnt++;
        inorder(root.right);
        }
    }
    public static void findMedian(Node root)
    {
        
        arr.clear();
        cnt = 0;
        inorder(root);
        if(cnt%2 == 0)
        {
            double res = (arr.get(cnt/2-1)+arr.get((cnt/2)))/2.0;
            if(res % 1 == 0)
                System.out.print((int)res);
            else
                System.out.print(res);
        }
        else
        {
            System.out.print(arr.get((cnt)/2));
        }
    }
}

******************************************************************************

----> Using morris algo space in o(1)**

class Tree
{
    public static void findMedian(Node root)
    {
         float ans=findMedianpk(root);
         if(ans%1==0)
         System.out.println((int)ans);
         else
         System.out.println(ans);
    }

    
    static int counNodes(Node root){ 
    Node current, pre; 
  
    
    int count = 0; 
  
    if (root == null) 
        return count; 
  
    current = root; 
    while (current != null) 
    { 
        if (current.left == null) 
        { 
            
            count++; 
  
           
            current = current.right; 
        } 
        else
        { 
            
            pre = current.left; 
  
            while (pre.right != null && 
                pre.right != current) 
                pre = pre.right; 
  
            
            if(pre.right == null) 
            { 
                pre.right = current; 
                current = current.left; 
            } 
  
            
            else
            { 
                pre.right = null; 
  
               
                count++; 
                current = current.right; 
            } 
        } 
    }
  
    return count; 
} 
  
  
/* Function to find median in O(n) time and O(1) space 
using Morris Inorder traversal*/
static float findMedianpk(Node root) 
{ 
if (root == null) 
        return 0; 
  
    int count = counNodes(root); 
    
    int currCount = 0; 
    Node current = root, pre = null, prev = null; 
  
    while (current != null) 
    { 
        if (current.left == null) 
        { 
            
            currCount++; 
  
            
            if (count % 2 != 0 && currCount == (count+1)/2) 
                return prev.data; 
  
            
            else if (count % 2 == 0 && currCount == (count/2)+1) 
                return (prev.data + current.data)/2; 
  
            
            prev = current; 
  
           
            current = current.right; 
        } 
        else
        { 
            
            pre = current.left; 
            while (pre.right != null && pre.right != current) 
                pre = pre.right; 
  
            
            if (pre.right == null) 
            { 
                pre.right = current; 
                current = current.left; 
            } 
  
            
            else
            { 
                pre.right = null; 
  
                prev = pre; 
  
                
                currCount++; 
  
                
                if (count % 2 != 0 && currCount == (count+1)/2 ) 
                    return current.data; 
  
                else if (count%2==0 && currCount == (count/2)+1) 
                    return (prev.data+current.data)/2; 
  
                
                prev = current; 
                current = current.right; 
  
            } 
        } 
    } 
    return -1;
} 
}