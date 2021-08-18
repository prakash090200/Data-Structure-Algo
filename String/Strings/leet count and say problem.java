https://leetcode.com/problems/count-and-say/submissions/

///// leet count and say problem

----> best time complexity***


class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s=countAndSay(n-1);
        String ss="";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();){
            int j=i+1;
            int count=1;
            while(j<s.length() && s.charAt(j)==s.charAt(i)){
                 count++;
                j++;
                 
            }
    
           sb.append(count).append(s.charAt(i));
            i=j;
        }
        
       return sb.toString(); 
    }
}







***************************




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
   
        
   