httpswww.geeksforgeeks.orgcheck-if-a-string-can-be-repeated-to-make-another-string


class GfG 
{ 
  
     
    static int getCount(String a, String b)  
    {  
        
        if(b.length() % a.length() != 0)  
            return -1;  
          
        int count = b.length() / a.length();  
      
         
        String str = "";  
        for(int i = 0; i < count; i++)  
        {  
            str = str + a;  
        } 
          
        if(str.equals(b))  
            return count;  
          
        return -1;  
    }  
  
  
    public static void main(String []args) 
    { 
        String a = "geeks";  
        String b = "geeksgeeks";  
        System.out.println(getCount(a, b)); 
    } 
} 
      

