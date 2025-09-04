public class RemoveDuplicates {
    public static int removeDuplicates(int []arr){
      int n=arr.length;
      int i=0;
      for(int j=1;j<n;j++){
        if (arr[j]!=arr[i]){
          arr[i+1]=arr[j];
          i++;
        }
      }
      return i+1;
    }
    public static void main(String[] args) {
      int []arr={1,1,2,2,3,4,4,5};
      int length=removeDuplicates(arr);

      System.out.println("The array after removing duplicates is: ");

      for(int k=0;k<length;k++){
        System.out.print(arr[k]+" ");
      }
    }
  
}
