https://practice.geeksforgeeks.org/problems/smaller-on-left20360700/1



Approach <TreeSet> --> t.lower() **********

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
