https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/submissions/

//Verify Preorder Serialization of a Binary Tree


class Solution {
    public boolean isValidSerialization(String preorder) {
    int diff = 0, index = 0; 
    String[] strs = preorder.split(",");
    while(index < strs.length){
        diff = strs[index++].equals("#") ? diff + 1 : diff - 1;
        if (diff >= 2) return false;
        if (diff == 1) break;
    }
    return diff == 1 && index == strs.length;
}
}

***********************************************
class Solution {
    public boolean isValidSerialization(String preorder) {
    int need = 1;
    for (String val : preorder.split(",")) {
        if (need == 0)
            return false;
        need -= " #".indexOf(val);
    }
    return need == 0;
}
}