/////sort-characters-by-frequency

class Solution {
     public String frequencySort(String s) {
	   //count the freq of all chars
        int[] count = new int[128];
        for(int value: s.toCharArray()) count[value]++;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count.length; i++){
            int max = findMax(count); //call the method that finds where the max index is
            if(count[max] == 0) break; 
            while(count[max] > 0){  //decrement the count char by char
                sb.append((char)(max));
                count[max]--;
            }
        }
        return sb.toString();
    }
    //find where the max index is
    public int findMax(int[] arr){
        int max = 0;
        int index = 0;
        for( int i = 0; i < arr.length; i++)
            if(max < arr[i]){
                index = i;
                max = arr[i];
            }
        return index;
    }
}


********************************************************************


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