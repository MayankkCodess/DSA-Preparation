import java.util.Scanner;

public class dectobin {

    public static int decimalprogram(int decNum){
        int  binNum = 0; 
        int pow = 0 ; 
        while(decNum>0){
            int remainder = decNum%2;
            binNum = binNum + remainder *(int)Math.pow(10, pow);
            decNum = decNum/2;
            pow++;

        }
        return binNum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you decimal number = ");
        int decNum = sc.nextInt();
        System.out.println(decimalprogram(decNum));


    }
}
