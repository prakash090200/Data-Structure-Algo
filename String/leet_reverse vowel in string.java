class Solution {
    public String reverseVowels(String s) {
        if(s.isEmpty())
            return new String();
        
       char []c=s.toCharArray();
        int start=0;
        int end=c.length-1;
        while(start< end){
            if(vowel(c[start]) && vowel(c[end])){
                char temp=c[start];
                c[start++]=c[end];
                c[end--]=temp;
                
            }
            else if(!vowel(c[start]))
            start++;
        
            
            else if(!vowel(c[end]))
                end--;
        }
        s=new String(c);
        return s;
    }
    public boolean vowel(char c){
        c=Character.toLowerCase(c);
          return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' );
             
        
    }
}
