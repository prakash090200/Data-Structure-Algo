//https://www.codespeedy.com/postfix-evaluation-in-java/



public class PostfixEval  
{ 
protected  static int evalPostfix(String express) 
    { 
        Stack<Integer> st = new Stack<>(); 
          
        for(int i=0; i < express.length(); i++) 
        { 
            char ch = express.charAt(i); 
             
            if(Character.isDigit(ch)) 
            st.push(ch - '0'); 
              
           
            else     
            { 
                int value1 = st.pop(); 
                int value2 = st.pop(); 
                  
                switch(ch) 
                { 
                    case '+': 
                    st.push(value2 + value1); 
                    break; 
                      
                    case '-': 
                    st.push(value2 - value1); 
                    break; 
                        
                    case '*': 
                    st.push(value2*value1); 
                    break; 
                    case '/': 
                    st.push(value2/value1); 
                    break; 
              } 
            } 
        } 
        return st.pop();    
    } 
      
    
    public static void main(String[] args)  
    { 
String express="432*+11-"; 
System.out.println("Postfix evaluation of the given expression comes out to be :" +evalPostfix(express)); 
    } 
} 