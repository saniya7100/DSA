public class MissingNum {
  public static int missingnum(int arr[],int n){
    int xor1=0;
    int xor2=0;

    for(int i=0;i<n-1;i++){
      xor1=xor1^arr[i];
      xor2=xor2^(i+1);
    }
    xor2=xor2^n;
    return xor1^xor2;
  
  }
  public static void main(String[] args) {
    int arr[]={1,2,4,5,6};
    int n=arr.length+1;
    int ans=missingnum(arr,n);
    System.out.println("Missing number is: "+ans);
  }
  
}
