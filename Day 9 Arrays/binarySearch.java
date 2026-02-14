public class binarySearch {

    public static int binary_Search(int numbers[], int key){
        int start = 0 ; int end = numbers.length-1;

        while(start<=end){
            int mid =( start + end )/2;

            if(numbers[mid] == key){
                return mid;
            }else if(numbers[mid]<key){
                start = mid + 1;
            }else {
                end = mid -1; 
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4, 6, 8, 10, 12};
        int key = 12;
     binary_Search(numbers, key);
        System.out.println("Your key is at the index of :" + binary_Search(numbers, key));
        System.out.println("Chal toh thik hai na bidu aaj samaj gya na ki tumhare karm aur chyan ke marg hi tumhari niyati ko nirdharit karte hain");
        
    }
}
