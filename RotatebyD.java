public class RotatebyD {
  public static void RotatebyD(int []arr,int start,int end){
    while(start<end){
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;

    }
  }
    public static void RotatebyD(int []arr,int k){

      int n=arr.length;
      k=k%n;
      RotatebyD(arr,0,k-1);
      RotatebyD(arr,k,n-1);
      RotatebyD(arr,0,n-1);

    }
  public static void main(String[] args) {
      int []arr={1,2,3,4,5};    
      int d=2;
      RotatebyD(arr,d);

      System.out.println("The array after rotating by d is: ");

      for(int k=0;k<arr.length;k++){
        System.out.print(arr[k]+" ");
      }


  }
  
}
