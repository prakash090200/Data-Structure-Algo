// https://www.geeksforgeeks.org/function-to-find-number-of-customers-who-could-not-get-a-computer

class GFG 
{
  
static int MAX_CHAR = 26; 
  

static int runCustomerSimulation(int n, char []seq) 
{ 
 
    char []seen = new char[MAX_CHAR]; 
  
    
    int res = 0; 
  
    int occupied = 0; 
  
    
    for (int i=0; i< seq.length; i++) 
    { 
       
        int ind = seq[i] - 'A'; 
  
        
        if (seen[ind] == 0) 
        { 
            
            seen[ind] = 1; 
  
           
            if (occupied < n) 
            { 
                occupied++; 
  
                
                seen[ind] = 2; 
            } 
  
             
            else
                res++; 
        } 
  
        
        else
        { 
              
        
        if (seen[ind] == 2) 
            occupied--; 
        seen[ind] = 0; 
        }

 
    } 
    return res; 
} 
  

public static void main(String[] args)
{
    System.out.println(runCustomerSimulation(2, "ABBAJJKZKZ".toCharArray())); 
    System.out.println(runCustomerSimulation(3, "GACCBDDBAGEE".toCharArray())); 
    System.out.println(runCustomerSimulation(3, "GACCBGDDBAEE".toCharArray())); 
    System.out.println(runCustomerSimulation(1, "ABCBCA".toCharArray())); 
    System.out.println(runCustomerSimulation(1, "ABCBCADEED".toCharArray())); 
}
}