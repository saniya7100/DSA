public class Linear{
  public static int linearseach(int arr[],int num)
  {
    for(int i=0;i<arr.length;i++){
      if(arr[i]==num){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    int num=9;
    int ans=(linearseach(arr,num));
    if(ans==-1){
      System.out.println("Not found");
    }
    else{
      System.out.println("Found at index: "+ans);
    }
  }

}