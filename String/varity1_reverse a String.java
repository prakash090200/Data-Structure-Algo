https://leetcode.com/problems/reverse-string/submissions/


class Solution {
    public void reverseString(char[] a) {
           int start=0;
           int end=a.length-1;
        while(start<end){
            char temp=a[start];
                 a[start++]=a[end];
                 a[end--]=temp;
               
        }
      
    }
}