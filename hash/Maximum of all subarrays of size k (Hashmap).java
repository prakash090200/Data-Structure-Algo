//// Maximum of all subarrays of size k (Hashmap)

//// Count distinct elements in every window (hashmap)
**************************************************************

class solve{
    static ArrayList <Integer> max_of_subarrays(int A[], int n, int k)
    {    
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();


        int j=0;
     for(int i=0;i<k;i++)
     add(h,A[j++]);
     a.add(Collections.max(h.keySet()));
     for(int i=0;i<n-k;i++){
         delete(h,A[i]);
         add(h,A[j++]);
         a.add(Collections.max(h.keySet()));
         
     }
       return a;
       
    }

  static void add(HashMap<Integer,Integer> h,int g){
        if(h.containsKey(g))
        h.put(g,h.get(g)+1);
        else
        h.put(g,1);
    }
    static void delete(HashMap<Integer,Integer> h,int g){
        if(h.get(g)==1)
        h.remove(g);
        else
        h.put(g,h.get(g)-1);
    }
}