public class printsubarrays {

    public static void sub_array(int numbers[]){
        for(int i= 0 ; i<numbers.length-1; i++){
           for(int j=i+1; j<numbers.length; j++){
            
            int array1[] = {numbers[i] , numbers[j]};
            
           }
        }
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        sub_array(numbers);
    }
}
