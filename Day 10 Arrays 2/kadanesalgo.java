public class kadanesalgo {

    public static void kadanes(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);


        }
        System.out.println("Max Subarray is:" + ms);
    }
    public static void main(String args[]){
        int numbers[] = {-1, -3, 4, 2, -1, -2, 5};
        kadanes(numbers);
    }
}
