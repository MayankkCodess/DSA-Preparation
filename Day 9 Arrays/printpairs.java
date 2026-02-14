public class printpairs {

    public static void print_pairs(int numbers[]){
        for(int i = 0; i<numbers.length; i++){
            for(int j=i+1 ; j<numbers.length; j++){
                System.out.print(" ( " + numbers[i] + "," + numbers[j] + " )");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int numbers[] = {3, 6, 8, 9, 10, 12, 14,};
        print_pairs(numbers);
    }
}
