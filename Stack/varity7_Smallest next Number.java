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
class Complete{
public static int[] Smallestonleft (int arr[], int n) {

        TreeSet<Integer> t=new TreeSet<>();
        int [] res=new int[n];
         int j=0;
        for(int i=0;i<n;i++){
            t.add(arr[i]);
            res[j++]=(t.lower(arr[i])==null)?-1:t.lower(arr[i]);
            
            }
          return res;
        
          }
    }
