// Parenthesis Checker

class Parenthesis
{  
    static Character check(Character c){
        if(c==')')
        return '(';
        else if(c==']')
        return '[';
        else if(c=='}')
        return '{';
        else
        return '\0';
    }
   
    static boolean ispar(String x)
    {
        Stack<Character> s=new Stack<>();
        char c='\0';
        boolean flag=true;
        for(int i=0;i<x.length();i++){
            c=x.charAt(i);
            if(c=='[' || c=='{' || c=='('){
                s.push(c);
            }
            else if(c==']' || c==')' || c=='}'){
             if(s.isEmpty() || s.pop()!=check(c))
                flag=false;
            }
            
        }
        if(!s.isEmpty())
        return false;
        else
        return flag;
    }
}
