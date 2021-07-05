https://practice.geeksforgeeks.org/problems/smaller-on-left20360700/1



Approach <TreeSet> --> t.lower() **********

//Best*****
class Complete{

    public static int[] Smallestonleft (int a[], int n) {
 
        int[] b = new int[n];
    TreeMap<Integer,Integer> map = new TreeMap<>();
    for (int i=0, j=0; i < n; i++, j++)
    {
        map.put(a[i], 1);
        if (map.lowerKey(a[i]) == null)
            b[j] = -1;
        else
            b[j] = map.lowerKey(a[i]);
    }
    return b;
    }
    
    
}

*****************************************************************
class Complete{
public static int[] Smallestonleft (int arr[], int n) {

        TreeSet<Integer> t=new TreeSet<>();
        int [] res=new int[n];
       res[0]=-1;
        for(int i=1;i<n;i++){
            t.add(arr[i-1]);
            res[i]=(t.lower(arr[i])==null)?-1:t.lower(arr[i]);
            
            }
          return res;
        
          }
    }
