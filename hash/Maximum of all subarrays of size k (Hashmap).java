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
**********************************************************
//// Maximum of all subarrays of size k

class solve{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {    
        Deque<Integer>q= new LinkedList<Integer>();
        ArrayList<Integer>retVal = new ArrayList<>();
        int i;
        for(i=0;i<k;i++){
            while(!q.isEmpty() && arr[i]>=arr[q.peekLast()])
            q.removeLast();
            q.addLast(i);
        }
        for(;i<n;i++){
            retVal.add(arr[q.peek()]);
            while(!q.isEmpty() && q.peek() <= i-k)
            q.removeFirst();
            while(!q.isEmpty() && arr[i]>=arr[q.peekLast()])
            q.removeLast();
            q.addLast(i);
        }
        retVal.add(arr[q.peek()]);
        return retVal;
        
    }
    
}