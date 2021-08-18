https://practice.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1#

https://www.youtube.com/watch?v=8wQ7JE5pFXU&t=513s&ab_channel=SimpleSnippets
https://www.youtube.com/watch?v=PAceaOSnxQs&ab_channel=Jenny%27slecturesCS%2FITNET%26JRF

//Infix to Postfix

i) precedence
ii) associativity

class Solution
{
    
	public static String infixToPostfix(String exp) {
	
        StringBuffer sb=new StringBuffer();
         
        Stack<Character> stack = new Stack<>();
         
        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);
             
            
            if (Character.isLetterOrDigit(c))
                sb.append(c);
             
            else if (c == '(')
                stack.push(c);
             
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                   sb.append(stack.pop());
                 
                    stack.pop();
            }
            else if(c=='^' && stack.peek()=='^')
                  stack.push(c);
            else 
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
                    sb.append(stack.pop());
                    
                    
                    stack.push(c);
            }
		     
		}
		 while (!stack.isEmpty()){
            
            sb.append(stack.pop());
         }
        return sb.toString();
		
	} 
	 static int Prec(char ch){
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
      
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        }
        return -1;
    }
}