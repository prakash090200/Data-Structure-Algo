https://practice.geeksforgeeks.org/problems/count-the-reversals0401/1#

//Count the Reversals to make parentheses balanace


class Sol
{
    int countRev (String str)
    {
       Stack<Character> st = new Stack<Character>();
	   
	    if(str.length()%2!=0)
	    return -1;
	   
	   
	     for(int i=0;i<str.length();i++)
	     {
	         char ch = str.charAt(i);
	         
	         if(ch=='{')
	         {
	             st.push(ch);
	         }
	         else
	         {
	             if(st.isEmpty()==false && st.peek()=='{')
	             st.pop();
	             else
	             st.push(ch);
	         }
	     }
	   
	     int r = st.size();
	     int n = 0;
	     
	     while(!st.isEmpty() && st.peek()=='{')
	     {
	         st.pop();
	         n++;
	     }
	     return (r/2+n%2);
	 }    
    
}
