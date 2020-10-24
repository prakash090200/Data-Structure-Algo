class Main {
    public static int solve(String s, int n){
        int max=Integer.MIN_VALUE;
        int count;
        for(int i=0;i<n;i++){
            HashSet<Character> h=new HashSet<>();
            int j=i;
            count=0;
            while(j<n && !h.contains(s.charAt(j))){
                h.add(s.charAt(j));
                count++;

                max=Math.max(max,count);
                j++;

            }

        }
        return max;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        String ss=sc.next();
        while(t-- >0){
            int count=solve(ss,ss.length());
            System.out.println(count);
        }
    }
}