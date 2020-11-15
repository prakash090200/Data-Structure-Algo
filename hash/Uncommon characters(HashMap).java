//// Uncommon characters
class Solution
{
    String UncommonChars(String A, String B)
    {
        PriorityQueue<Character> t=new PriorityQueue<>();
        HashMap<Character,Integer> h=new HashMap<>();
        String s="";
      HashSet<Character> hm=new HashSet<>();
        for(int i=0;i<B.length();i++){
            h.put(B.charAt(i),0);
        }
        for(int i=0;i<A.length();i++)
            hm.add(A.charAt(i));
        
        for(char c:hm){
            
            if(!h.containsKey(c))
            h.put(c,0);
            else
            h.put(c,h.get(c)+1);
        }
        for(char val:h.keySet()){
            if(h.get(val)==0)
            t.add(val);
        }
      
        while(!t.isEmpty()){
            s+=t.remove();
        }
        if(s.isEmpty())
        return "-1";
        else
        
        return s;
    }
}