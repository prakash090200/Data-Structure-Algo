////leet_ reverse each word in string.java

--> best time complexity

class Solution {
    public String reverseWords(String s) {
       if (s.isEmpty()) {
            return s;
        }
	
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        boolean isWord = false;
        int begin = -1;
        for (int i=0;i<n;i++) {
            if (s.charAt(i) != ' ') {
                if (!isWord) {
                    begin = i;
                }
                isWord = true;
            }
            else {
                if (isWord) {
                    sb.insert(0, " "+s.substring(begin, i));
                }
                isWord = false;
            }
        }
        if (isWord) {
            sb.insert(0, " "+s.substring(begin));
        }
        if (begin == -1) {
            return new String();
        }
        return sb.toString().substring(1);
    }
}


*****************************************************
high time complexity:

class Solution {
    public String reverseWords(String ss) {
        String s[]=ss.trim().split("[\\s]+");
      int start=0;
        int end=s.length-1;
        while(start<end){
            String temp=s[start];
            s[start++]=s[end];
            s[end--]=temp;
        }
    String st="";
        for(int i=0;i<s.length-1;i++)
            st+=s[i]+" ";
        st+=s[s.length-1];
        return st;
    }
}
************************************************
