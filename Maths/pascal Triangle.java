//Pascal Triangle
/*
class Main {
     public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
         ArrayList<Integer> b=new ArrayList<>();
           int n = s.nextInt();
         for (int i = 1; i <= n; i++) {
             int [] a=new int[i];
           if (i == 1) 
               System.out.println(1);
             else { a[0]=1;a[a.length-1]=1;for(int j=1;j<a.length-1;j++) a[j]=b.get(j-1);b.clear();
                 for(int j=0;j<a.length;j++) System.out.print(a[j]+" ");System.out.println();
                 for(int j=1;j<a.length;j++) b.add(a[j]+a[j-1]);
                 a=null;}
             }
     }}

