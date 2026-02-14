import java.util.*;
public class bintodec {

    public static int binaryProgram(int binNum){
           int decNum = 0;
           int pow = 0; 

           while(binNum >0){
            int lastDigit = binNum % 10 ;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            binNum = binNum/10;
            pow++;
           }
           return decNum;
    }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your binay number");
     int binNum = sc.nextInt();
     binaryProgram(binNum);
     System.out.println("decimal of " + binNum +" = " + binaryProgram(binNum));
    }
}
