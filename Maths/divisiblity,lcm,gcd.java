1) divisibility rules:
https://www.youtube.com/watch?v=BssszjSmcoA
   unit digit of any number multiply with X and add in reminig part and divide it and check.
    a) 7 --> unit digit *5
    b) 13--> unit digit *4
    c) 17--> unit digit *12
    d) 19--> unit digit *2
    e) 23--> unit digit *7
    f) 29--> unit digit *3
    g) 11-->https://www.youtube.com/watch?v=xKZGqkwmv1I
          (diff of sum of alternative no must be 0, 11 or multiple of 11).

2)-->largest number from set of number divisible by 2,3,5.

https://www.geeksforgeeks.org/largest-number-with-the-given-set-of-n-digits-that-is-divisible-by-2-3-and-5/
a) arrange it in decending order and checkif 0 is present in array or not.
b) find sum %3, compute remainder and REMOVE element matched with remainder 
c) in no element found which is same as remainder( remainder=N-remainder).
d) count<=N-1 ( remove element matched with new remainder).

***********************************************************************
3) LCM, GCD OF A NUMBER USING Euclidean algo:
       gcd*lcm=a*b
       -> lcm=(a*b)/lcm;
https://www.geeksforgeeks.org/program-to-find-lcm-of-two-numbers/
*************************************************************************

4) Smallest n digit number divisible by given three numbers:
https://www.geeksforgeeks.org/smallest-n-digit-number-divisible-by-given-three-numbers/

5) Largest N digit number divisible by given three numbers:

 https://www.geeksforgeeks.org/largest-n-digit-number-divisible-by-given-three-numbers/

6) Smallest number divisible by first n numbers
                    OR
  LCM of First n Natural Numbers
https://www.geeksforgeeks.org/smallest-number-divisible-first-n-numbers/



7)Sum of n digit numbers divisible by a given number
https://www.geeksforgeeks.org/sum-n-digit-numbers-divisible-given-number/
*****************************************************************************

Count =(lastnum - firstnum)/ number + 1;
sum=(firstnum + lastnum)*count/2; (sum in AP when first and last term in known)
*****************************************************************************
8)Count n digit numbers divisible by given number
https://www.geeksforgeeks.org/count-n-digit-numbers-divisible-by-given-number/
https://leetcode.com/problems/largest-divisible-subset/

******************************************************************
//lcm and gcd of 2 number, gcd=hcf
/*
class Main{
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer();
       int n=6;
       lsm(n);
    }
    public static void lsm(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=(ans*i)/gcd(ans,i);
        }
        System.out.println(ans);
    }
    public static int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }

 }
***********************************************************************
/// Divisibility  rule of 11.
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
       String s=Integer.toString(n);
       int c1=0;
       int c2=0;
       for(int i=0;i<s.length();i++) {
           int c = (int) (s.charAt(i) - '0');
           if(i%2==0)
           c1+=c;
           else
           c2+=c;
      
       }
        c1=Math.abs(c1-c2);
        if(c1%11==0)
            System.out.println(11);
      else
            System.out.println(12);
    }
 }
*****************************************************************
// Divisiblity rule of 7,13,17,19,23,29.
 class Main {
     public static void main(String[] args) {
      Scanner s =new Scanner (System.in);
      int n=s.nextInt();
         int a=0,b=0;
         while(n>100){
             a=n%10;
             n=(n/10)+(a*7);
         }
         if(n%23==0)
             System.out.println(23);
         else
             System.out.println(24);
     }
 }
************************************************************





