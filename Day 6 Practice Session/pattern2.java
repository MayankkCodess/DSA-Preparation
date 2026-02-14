public class pattern2 {
    public static void main(String args[]){
        int num = 5; 
        int pattern = 1;
        for(int i = 1; i<= num ; i++){
            for(int j = 1 ; j<=i; j++){
                System.out.print(pattern);
                System.out.print(" ");
                pattern++;
            }
            System.out.println();
        }
    }
}