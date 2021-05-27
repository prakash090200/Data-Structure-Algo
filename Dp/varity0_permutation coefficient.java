
https://www.geeksforgeeks.org/permutation-coefficient/

//Permutation Coefficient


class GFG
{
    static int PermutationCoeff(int n,
                                int k)
    {
        int Fn = 1, Fk = 1;
     
        // Compute n! and (n-k)!
        for (int i = 1; i <= n; i++)
        {
            Fn *= i;
            if (i == n - k)
            Fk = Fn;
        }
        int coeff = Fn / Fk;
        return coeff;
    }