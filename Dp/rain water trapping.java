 */ // rain water trapping
/*class Main{
  public static void main(String [] args){
    int arr[]={3, 0, 2, 0, 4};
    int [] right=new int[5];
    int [] left=new int[5];
    //int [] water=new int[];
    int max=0;
    int sum=0;
    for(int i=0;i<arr.length;i++){
      max = Math.max(max, arr[i]);
      left[i]=max;
    }
    max=0;
      for(int i=arr.length-1;i>=0;i--) {
        max = Math.max(max, arr[i]);
        right[i]=max;
      }
    for(int i=0;i<arr.length;i++)
      sum+=Math.min(left[i],right[i])-arr[i];
    System.out.println(sum);

  }

}
