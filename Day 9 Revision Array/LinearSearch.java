public class LinearSearch {
    public static int linearSearch(int arr[] ,int key){
        //find the index of key using linear Search 
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        int key = 8;
     
       System.out.println( linearSearch(arr, key)) ;

    }
}