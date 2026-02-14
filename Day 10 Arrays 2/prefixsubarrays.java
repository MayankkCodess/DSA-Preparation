public class prefixsubarrays {

        public static void print_subarray(int arr[]){
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE;
            int prefix[] = new int[arr.length];

            prefix[0] = arr[0];
            //calculate prefix array

            for(int i =1; i<prefix.length;i++ ){
                prefix[i] = prefix[i-1] + arr[i];
            }
            for(int i= 0 ; i<arr.length; i++){
                for(int j= i; j<arr.length; j++){
                          currSum = i ==0 ? prefix[j] : prefix[j] - prefix[i - 1];
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

