https://practice.geeksforgeeks.org/problems/min-number-of-flips3210/1#

//Min Number of Flips 

class Solution {
    public int minFlips(String s) {
        int count = 0;
	    for(int i = 0; i<s.length(); i++) {
	        if(i%2 == 0 && s.charAt(i) == '0')
	            count++;
	       else if(i%2 !=0 && s.charAt(i) == '1')
	            count++;
	    }
	   
	    return Math.min(count, s.length()-count);
    }
}