//Leaders in an array
class Leader{
    
    static ArrayList<Integer> leaders(int arr[], int n){
        
        ArrayList<Integer> a=new ArrayList<>();
        a.add(arr[n-1]);
        int max=arr[n-1];
//int max=0;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
            max=Math.max(arr[i],max);
           // if(!a.contains(max))
            a.add(max);
            }
            
        }
        Collections.reverse(a);
        return a;
     
    }
    
}
