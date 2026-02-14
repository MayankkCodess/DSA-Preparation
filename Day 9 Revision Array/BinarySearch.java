public class BinarySearch {
    public static void binarySearch(int arr[] , int key) {
        int start = 0 ;
        int end = arr.length-1;
        while(start <= end){
           int mid = (start + end ) / 2;
           if(arr[mid]== key){
            System.out.println("key is at index" + mid);
            return ;
           }
           if(key > arr[mid]){ 
            start = mid+1;
           }else{
            end = mid-1;
           }

        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14};
        int key = 12;
         binarySearch(arr,key);
    }
}
