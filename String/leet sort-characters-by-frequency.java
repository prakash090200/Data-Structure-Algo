/////sort-characters-by-frequency


class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> h = new HashMap<>();
           
      PriorityQueue <Map.Entry<Character,Integer>> p=new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
          
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           h.put(c,h.getOrDefault(c,0)+1);
       }
        for(Map.Entry<Character,Integer> c:h.entrySet())
            p.add(c);
        
        String ss="";
        while(p.size()>0){
            Map.Entry<Character,Integer> c=p.remove();
            int k=c.getValue();
           while(k-->0){
                ss+=c.getKey();
              }
        }
        
              
        return ss;
    }
}