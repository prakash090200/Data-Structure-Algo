 https://leetcode.com/problems/consecutive-numbers-sum/submissions/

///// Count ways to express a number as sum of consecutive numbers

class Solution {
    public int consecutiveNumbersSum(int N) {
        int result = 1;
int sum = 0;
int i = 2;

while (sum < N){
	sum += i - 1;
	if ((N - sum > 0) && (N - sum) % i == 0) result++;
	i++;
}

return result;
    }
}




