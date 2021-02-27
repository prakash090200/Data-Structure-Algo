https://www.techiedelight.com/find-square-number-without-using-multiplication-division-operator/

https://www.geeksforgeeks.org/calculate-square-of-a-number-without-using-and-pow/#:~:text=Given%20an%20integer%20n%2C%20calculate,*%2C%20%2F%20and%20pow().&text=A%20Simple%20Solution%20is%20to%20repeatedly%20add%20n%20to%20result.


class GFG {
    static int square(int n)
    {
 
       
        if (n == 0)
            return 0;
 
        // Handle negative number
        if (n < 0)
            n = -n;
 
        int x = n >> 1;
 
       
        if (n % 2 != 0)
            return ((square(x) << 2) + (x << 2) + 1);
        else 
            return (square(x) << 2);
    }

*********************************************
or

class Main
{
    public static int findSquare(int num)
    {
        int odd = 1;
        int sq = 0;
 
        // convert the number to positive if it is negative
        num = Math.abs(num);
 
        while (num-- > 0)
        {
            sq = sq + odd;
            odd = odd + 2;
        }
 
        return sq;
    }
 
    public static void main(String[] args)
    {
        System.out.println(findSquare(8));
        System.out.println(findSquare(-4));
    }
}