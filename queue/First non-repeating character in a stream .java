https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1

https://www.interviewbit.com/problems/first-non-repeating-character-in-a-stream-of-characters/

///First non-repeating character in a stream 


---> here we need our insertion order maintained
     either we can use linkedHashMap or Queue because only in these data structure insertion order      can be maintained.

//best**
class Solution
{
    public String FirstNonRepeating(String s)
    {  
        LinkedHashMap<Character,Integer> h=new LinkedHashMap<>();
        StringBuffer sb=new StringBuffer();
        sb.append(s.charAt(0));
        h.put(s.charAt(0),h.getOrDefault(s.charAt(0),0)+1);
        for(int i=1;i<s.length();i++){
             h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
              sb.append(check(h));
        }
        return sb.toString();
    }
    public static char check(LinkedHashMap<Character,Integer> h){
        
        char c='#';
       for(Map.Entry<Character,Integer> m:h.entrySet()){
            if(m.getValue()==1){
                c=m.getKey();
                break;
            }
        }
       return c;
        
    }
}

**************************************************************
public class Solution {
    public String solve(String s) {
          int cnt[] = new int[26];
        Queue <Character> q = new ArrayDeque<>();
        int n = s.length();
        char ans[] = new char[n];
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            cnt[c - 'a']++;
            if(cnt[c - 'a'] == 1)   
               q.add(c);
            while(!q.isEmpty() && cnt[q.peek() - 'a'] > 1)  
               q.poll();
            if(q.isEmpty()) 
               ans[i] = '#';
            else    
               ans[i] = q.peek();
        }
        return new String(ans);
    }
}