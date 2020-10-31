// lcs print
/*
class Main{
    public static String sub(String x, String y,int n,int m) {
       int[][] t = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (n == 0 || m == 0)
                    t[i][j]=0;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(x.charAt(i-1)==y.charAt(j-1))
                    t[i][j]=1+t[i-1][j-1];
                else
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        String s="";
        int i=n;
        int j=m;
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                s+=x.charAt(i-1);
                j--;
                i--;
            }
            else{
                if(t[i][j-1]>t[i-1][j])
                    j--;
                else
                     i--;
            }

        }
        return (new StringBuffer(s).reverse()).toString();



    }
    public static void main(String [] args){
        String x="aaaabbaa";
        String y=new StringBuffer(x);
        System.out.println(sub(x,y,x.length(),y.length()));

    }
}

