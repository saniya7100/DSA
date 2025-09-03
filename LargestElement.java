public class LargestElement {
    public static int findLargest(int[]arr){
        int largest=arr[0];
        int n =arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int []arr={10,20,5,30,15};
        int largest=findLargest(arr);
        System.out.println("The largest element in the array is: "+largest);
    }
    
}
