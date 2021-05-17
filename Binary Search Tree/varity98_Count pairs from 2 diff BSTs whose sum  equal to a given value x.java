
https://practice.geeksforgeeks.org/problems/brothers-from-different-root/1#

//Brothers From Different Roots

// Count pairs from two BSTs whose sum is equal to a given value x




class GfG
{
   public static int countPairs(Node root1, Node root2, int x){
        if(root1 == null){
            return 0;
        }
        
        int pairCount = 0;
        int option1 = countPairs(root1.left, root2, x);
        int option2 = countPairs(root1.right, root2, x);
        
        pairCount = findElement(root2, x-root1.data);
        
        return (pairCount + option1 + option2);
    }
    
    private static int findElement(Node root, int elem){
        if(root ==  null){
            return 0;
        }
        
        int isElemFound = 0;
        if(elem == root.data){
            isElemFound = 1;
        }else if(elem < root.data){
            isElemFound = findElement(root.left,elem);
        }else if(elem > root.data){
            isElemFound = findElement(root.right,elem);
        }
        
        return isElemFound;
    }
}
