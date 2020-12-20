///// leet count and say problem

----> best time complexity


class Solution {
    public String countAndSay(int n) {
        
        if(n==1){
            return "1";             //return the string "1" when n==1
        }
        
        String s = countAndSay(n-1); //recursively calls countAndSay until n==1
        
        StringBuilder sn = new StringBuilder();
        int len = s.length();
        
        for(int i = 0; i < len; ){  //incrementing i inside the loop
            int j = i + 1;          //j is used to count the same digit repeatedly
            int count = 1;          //counter to count the repeated digit
            if(j < len){            //check if j is less than the length of the string
                while((s.charAt(j) == s.charAt(i))){    //run as long as the contiguos characters are same
                    count += 1;
                    j++;
                    if(!(j < len)){     //check if j is greater than the length
                        break;
                    }
                }
            }            

            sn.append(count).append(s.charAt(i));   //append the count and the digit to the string
            i = j;  //update i to skip all the repeated digits
        }
        return sn.toString();
        
    }
}








***************************

--> best time complexity (1st one more better)


class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        if(n==2) return "11";
        String s="11";
        for(int j=3;j<=n;j++){
            StringBuilder temp=new StringBuilder();
            s+='$';
            int count=1;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(i-1)){
                    temp.append(count).append(s.charAt(i-1));
                    count=1;
                }
                else
                    count++;
            }
            s=temp.toString();
        }
        
        return s;
    }
}
   
        
    }
}