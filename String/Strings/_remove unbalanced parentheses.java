https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
//Minimum Remove to Make Valid Parentheses

class Solution {
    public String minRemoveToMakeValid(String s) {
        if(s == null || s.length() == 0)
            return s;
        
        StringBuilder sb = new StringBuilder(s);
        
        // stack to hold indices of paranthesis that should be removed.       
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(sb.charAt(i) == '(') 
                stack.push(i);
            
            else if(sb.charAt(i) == ')'){
                if(!stack.isEmpty() && sb.charAt(stack.peek()) == '(')
                    stack.pop();
                else
                    stack.push(i);
            }
            
        
        }
        System.out.println(stack);
        while(!stack.isEmpty()) {
            sb.deleteCharAt(stack.pop());
        }
        return sb.toString();
    }
}