public class KthMissingNo{
    public static int findMissingNo(int arr[], int k){
    int left = 0;
    int right = arr.length;
    while(left<right){
     int mid = left +( right-left)/2;
     if(arr[mid] - mid -1 < k){
        left = mid + 1;
     }else {
        right = mid;
     }
    }
    return left + k;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,4,7,11};
        int k = 5;
        System.out.println(findMissingNo(arr,k));
    }
}