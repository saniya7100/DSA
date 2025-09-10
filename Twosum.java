
import java.util.Arrays;
public class Twosum {
  public static String twosum (int[]arr, int target){

    Arrays.sort(arr);

    int left=0;
    int right=arr.length-1;

    while(left < right){
      int sum=arr[left]+arr[right];

      if(sum==target){
        return "Yes";
      }else if(sum<target){
        left++;
      }else{
        right--;
      }
    }
    return "No";
  }

  public static void main(String[] args) {
    int[] arr={0,1,2,3,5,7,8,9};
    int target=0;
    System.out.println(twosum(arr,
    target ));
  }
  
}
