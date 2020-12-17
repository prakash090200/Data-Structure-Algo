static boolean isAnagram(String c, String d)
{
    if (c.length() != d.length())
        return false;
         
    int count = 0;
 
    
    for(int i = 0; i < c.length(); i++)
    {
        count = count + c.charAt(i);
    }
 
  
    for(int i = 0; i < d.length(); i++)
    {
        count = count - d.charAt(i);
    }
 
   
    return (count == 0);
}