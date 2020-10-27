class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> a=new ArrayList<>();
        LinkedHashSet<Integer> l1=new LinkedHashSet<>();
        LinkedHashSet<Integer> l2=new LinkedHashSet<>();
        for(int i=0;i<n1;i++)
            l1.add(A[i]);
        for(int i=0;i<n2;i++)
           l2.add(B[i]);
    
        for(int i=0;i<n3;i++)
            if(l1.contains(C[i]) && l2.contains(C[i])){
                if(a.contains(C[i]))
                continue;
                else
                a.add(C[i]);
            }
            
        Collections.sort(a);
        return a;
    }
}