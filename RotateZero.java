public class RotateZero {
  public static int rotate(int arr[]){
    int n=arr.length;
    int j=-1;
    for(int i=0;i<n;i++){
      if (arr[i]==0){
        j=i;
        break;
      }
    }
    if(j==-1){
      return n;
    }
    for(int i=j+1;i<n;i++){
      if(arr[i]!=0){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j++;
      }
    }
    return j;
  }
  public static void main(String[] args) {
    int arr[]={1,0,2,3,2,0,0,4,5,1,1,0,3,12};
    rotate(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }

  
}
