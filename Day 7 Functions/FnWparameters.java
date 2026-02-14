import java.util.*;
public class FnWparameters {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static void calculateSum(int num1 , int num2){
       
        int sum = num1 + num2 ; 
        System.out.println("Sum is : " + sum);
    }
    public static void main(String[] args) {
        printHelloWorld();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter A");
        int a = sc.nextInt();
        System.out.println(" Enter B");
        int  b = sc.nextInt();
        calculateSum(a,b);
    }
}
