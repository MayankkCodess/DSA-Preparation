import java.util.*;
public class RecursionBasics2 {

    public static void printInc(int n ){
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
     System.out.println(n + " ");
    }
    public static void main(String args[]){
        // int n ;
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInc(n);
    }
}
