https://leetcode.com/problems/next-greater-element-iii/submissions/

https://www.youtube.com/watch?v=53Rux5-mEDQ&ab_channel=NareshGupta

//// Next Greater Element III

class Solution {
    public int nextGreaterElement(int n) {
      char[] arr=String.valueOf(n).toCharArray();
      int i;
      for(i=arr.length-1;i>0;i--)
          if(arr[i]>arr[i-1])
              break;
    if(i==0)
        return -1;
    else{
        int x=arr[i-1],smallest=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]>x&&arr[j]<arr[smallest])
                smallest=j;
        }
        char temp=arr[i-1];
        arr[i-1]=arr[smallest];
        arr[smallest]=temp;
        Arrays.sort(arr,i,arr.length);
    }
    long out=Long.parseLong(String.valueOf(arr));
    return out<=Integer.MAX_VALUE? (int) out: -1;
    }
}

***********************************************************************************
--> EASY 

class Solution {
    public int nextGreaterElement(int n) {
    
        char [] c=(n+"").toCharArray();
        int i=c.length-2;
        while(i>=0 && c[i]>=c[i+1])
            i--;
        if(i==-1) return -1;
        int j=c.length-1;
        while(j>i && c[j]<=c[i])
            j--;
        swap(c,i,j);
        reverse(c,i+1);
        try{
            return (Integer.parseInt(new String (c)));
        }
        catch(Exception e){
            return -1;
        }
        
    }
    public static void swap(char [] c,int f,int l){
       
           char temp=c[f];
           c[f]=c[l];
           c[l]=temp;
       
    } 
     public static void reverse(char [] c,int ind){
       
         int f=ind;
         int l=c.length-1;
         while(f<l){
             char temp=c[f];
             c[f++]=c[l];
             c[l--]=temp;
         }
       
    } 
}
