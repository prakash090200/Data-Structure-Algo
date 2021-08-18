class Gfg
{
    
    public static void permute(String str, int l, int r){
    
        if(l==r){
            if(str.contains("AB")==false){
                System.out.print(str+" ");
            }
            return;
        }else{
            for(int i=l;i<=r;i++){
                str=new String(swap(str, i, l));
                
                permute(str,l+1,r);
                
                str=new String(swap(str, i, l));
            }   
        }
    }
    
    public static char[] swap(String str, int i, int j) 
    { 
        char ch[] = str.toCharArray(); 
        char temp = ch[i]; 
        ch[i] = ch[j]; 
        ch[j] = temp; 
        return ch; 
    }
    