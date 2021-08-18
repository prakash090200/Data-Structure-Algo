https://www.geeksforgeeks.org/check-if-a-string-can-be-made-equal-to-another-string-by-swapping-or-replacement-of-characters/


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
      

