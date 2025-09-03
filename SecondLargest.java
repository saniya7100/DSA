public class SecondLargest {
    public static int findSecondLargest(int[]arr){
        int largest=arr[0];
        int SecondLargest=Integer.MIN_VALUE;
        int n =arr.length;

        for(int i=1;i<n;i++){

            if(arr[i]>largest){
            SecondLargest=largest;
            largest=arr[i];
            }

            else if(arr[i]< largest && arr[i]>SecondLargest){
                SecondLargest=arr[i];
            }
            }
        return SecondLargest;
        }



    public static void main(String[] args) {
        int[] arr={10,10,8,5,4,3};   
        System.out.println(findSecondLargest(arr));
    }
    

    
}
