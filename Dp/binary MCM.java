 */
/** // binary Maximum area histogram
class Main {

  public static int[] call(int[] arr) {
    int n = arr.length;
    Stack<Integer> s = new Stack<>();
    int[] in = new int[7];
    in[0] = -1;
    s.push(0);
    for (int i = 1; i < n; i++) {
      if (s.isEmpty())
        in[i] = -1;
      while (!s.isEmpty() && arr[i] < arr[s.peek()])
        s.pop();
      in[i] = (s.isEmpty()) ? -1 : s.peek();
      s.push(i);
    }

    return in;
  }

  public static int[] calr(int[] arr) {
    int n = arr.length;
    Stack<Integer> s = new Stack<>();
    int[] in = new int[4];
    in[n - 1] = n + 1;
    s.push(n - 1);
    for (int i = arr.length - 2; i >= 0; i--) {
      if (s.isEmpty())
        in[i] = n + 1;
      while (!s.isEmpty() && arr[i] < arr[s.peek()])
        s.pop();
      in[i] = (s.isEmpty()) ? n + 1 : s.peek();
      s.push(i);
    }

    return in;
  }

  public static int mah(int[] arr) {
    int[] right = calr(arr);
    int[] left = call(arr);
    int max = Integer.MIN_VALUE;
    int area[] = new int[4];
    for (int i = 0; i < arr.length; i++) {
      area[i] = arr[i] * (right[i] - left[i] - 1);
      max = Math.max(arr[i] * (right[i] - left[i] - 1), max);

    }
    return max;
  }

  public static void main(String[] args) {
    int[][] arr = {
            { 0, 1, 1, 0 },
            { 1, 1, 1, 1 },
            { 1, 1, 1, 1 },
            { 1, 1, 0, 0 },
    };
    int n=4;
    int m=4;
    int [] a=new int[4];

    for(int i=0;i<m;i++)
      a[i]=arr[0][i];
    int max=mah(a);
    System.out.println(Arrays.toString(a));
     for(int i=1;i<n;i++){
       for(int j=0;j<m;j++){
         if(arr[i][j]==0)
           a[j]=0;
         else
         a[j]=arr[i][j]+a[j];
       }
       System.out.println(Arrays.toString(a));
       max=Math.max(max,mah(a));
     }
     System.out.println(max);
  }
}