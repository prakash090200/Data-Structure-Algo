// Minimize the maximum difference between the heights 

static int getMinDiff(int arr[], int n, int k) 
    { 
        if (n == 1) 
        return 0; 
  
        // Sort all elements 
        Arrays.sort(arr); 
  
        // Initialize result 
        int ans = arr[n-1] - arr[0]; 
  
        // Handle corner elements 
        int small = arr[0] + k; 
        int big = arr[n-1] - k; 
        int temp = 0; 
          
        if (small > big) 
        { 
            temp = small; 
            small = big; 
            big = temp; 
        } 
  
        // Traverse middle elements 
        for (int i = 1; i < n-1; i ++) 
        { 
            int subtract = arr[i] - k; 
            int add = arr[i] + k; 
  
            // If both subtraction and addition 
            // do not change diff 
            if (subtract >= small || add <= big) 
                continue; 
  
            // Either subtraction causes a smaller 
            // number or addition causes a greater 
            // number. Update small or big using 
            // greedy approach (If big - subtract 
            // causes smaller diff, update small 
            // Else update big) 

            if (big - subtract <= add - small) 
                small = subtract; 
            else
                big = add; 
        } 
  
        return Math.min(ans, big - small); 
    } 