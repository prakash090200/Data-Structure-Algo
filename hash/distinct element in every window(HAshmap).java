
/// Count distinct elements in every window (hashmap)
class  Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        int j=0;
     for(int i=0;i<k;i++)
     add(h,A[j++]);
     a.add(h.size());
     for(int i=0;i<n-k;i++){
         delete(h,A[i]);
         add(h,A[j++]);
         a.add(h.size());
         
     }
       return a;
       
    }
   void add(HashMap<Integer,Integer> h,int g){
        if(h.containsKey(g))
        h.put(g,h.get(g)+1);
        else
        h.put(g,1);
    }
    void delete(HashMap<Integer,Integer> h,int g){
        if(h.get(g)==1)
        h.remove(g);
        else
        h.put(g,h.get(g)-1);
    }
}

