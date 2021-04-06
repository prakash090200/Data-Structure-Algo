https://leetcode.com/problems/group-anagrams/

///  Group Anagrams


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
        Map<String , List<String> > map = new  HashMap<>();
    
        for( String st : strs ){
            char ch[] = st.toCharArray();
            
            Arrays.sort(ch);
            
            String sb = new String(ch);
            
            if( map.containsKey(sb) ){
                map.get(sb).add(st);
            }
            else{
                List<String> l = new ArrayList();
                l.add(st);
                map.put(sb, l);
            }
            
            
        }
        
        List<List<String>> list = new ArrayList<>();
        
        for( List<String> a  : map.values() ){
            list.add(a);
        }
        return list;
    }
}




class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
        Map<String , List<String> > map = new  HashMap<>();
    
        for( String st : strs ){
            char ch[] = st.toCharArray();
            
            Arrays.sort(ch);
            
            String sb = new String(ch);
            
            if( map.containsKey(sb) ){
                map.get(sb).add(st);
            }
            else{
                List<String> l = new ArrayList();
                l.add(st);
                map.put(sb, l);
            }
            
            
        }
        
        List<List<String>> list = new ArrayList<>();
        
        for( List<String> a  : map.values() ){
            list.add(a);
        }
        return list;
    }
}