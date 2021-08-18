https://practice.geeksforgeeks.org/problems/smaller-on-left20360700/1



Approach <TreeSet> --> t.lower() **********

//Best*****

class Complete{

    public static int[] Smallestonleft (int a[], int n) {
 
    int[] b = new int[n];
    TreeMap<Integer,Integer> map = new TreeMap<>();
    int j=0;
    for (int i=0;i < n;i++)
    {
        map.put(a[i],1);
        b[j++]=(map.lowerKey(a[i])==null)?-1:map.lowerKey(a[i]);
    }
    return b;
    }   
}

*****************************************************************
public static int[] Smallestonleft (int arr[], int n) {
          
          TreeSet<Integer> h=new TreeSet<>();
          int a[]=new int[n];
          Arrays.fill(a,-1);
          for(int i=0;i<n;i++){
              
              h.add(arr[i]);
              if(h.lower(arr[i])!=null)
                  a[i]=h.lower(arr[i]);
              
                
          }
          return a;
    }
    