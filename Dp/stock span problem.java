//Stock span problem
/*class Main{
    public static void solve(int [] price,int n,int[] s){
        Stack<Integer> stack=new Stack<>();
        stack.push(n-1);
        s[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(stack.empty() && price[stack.peek()]>price[i])
                s[i]=1;
            else{
                while(!stack.empty() && price[stack.peek()]<price[i])
                    stack.pop();
                s[i]=(stack.empty())?n-i:stack.peek()-i;
            }stack.push(i);}
     // for(int i=n-1;i>=0;i--)
          System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args){
        int price[] = { 80,120,90,5,4,10 };
        int n = price.length;
        int S[] = new int[n];
        solve(price, n, S);
    }
}