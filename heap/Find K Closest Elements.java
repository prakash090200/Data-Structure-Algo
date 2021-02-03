class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<Pair<Integer,Integer>>((a,b)-> b.getValue()-a.getValue());
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<k;i++)
            pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
        for(int i=k;i<arr.length;i++){
            int diff=Math.abs(arr[i]-x);
            if(pq.peek().getValue()>diff){
                pq.poll();
                pq.add(new Pair(arr[i],diff));
            }
        }
        while(!pq.isEmpty()){
            l.add(pq.poll().getKey());
        }
     Collections.sort(l);
        return l;
            
    }
}