public class max_subarrays {

    public static void print_subarray(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i= 0 ; i<arr.length; i++){
            for(int j= 0; j<arr.length; j++){
                      currSum =  0;
                for(int k=i; k<=j; k++){
                    currSum = currSum + arr[k];
                }
                System.out.println(currSum + " ");
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max subarray is : " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4, 7, 8, 9, 10};
        print_subarray(arr);
    }
}