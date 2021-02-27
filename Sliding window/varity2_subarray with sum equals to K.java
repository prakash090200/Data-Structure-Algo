 
https://www.geeksforgeeks.org/find-subarray-with-given-sum/


int subArraySum(int arr[], int n, int sum) 
    { 
        int curr_sum = arr[0], start = 0, i; 
  
        for (i = 1; i <= n; i++) { 
         
            while (curr_sum > sum && start < i - 1) { 
                curr_sum = curr_sum - arr[start]; 
                start++; 
            } 
  
        
            if (curr_sum == sum) { 
                int p = i - 1; 
                System.out.println( 
                    "Sum found between indexes " + start 
                    + " and " + p); 
                    return 1; 
            } 
  
            if (i < n) 
                curr_sum = curr_sum + arr[i]; 
        } 