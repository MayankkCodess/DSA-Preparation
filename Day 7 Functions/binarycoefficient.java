import java.util.Scanner;

public class binarycoefficient {
 
    public static int factorial(int n){
        int fact = 1 ; 
         for( int i = 1 ; i <= n ; i++){
             fact =fact *i ; 

         }
         return fact;
   }
    public static int factorial1(int r){
        int fact = 1 ; 
         for( int i = 1 ; i <= r ; i++){
             fact =fact *r ; 

         }
         return fact;
   }
   public static int bin_coeff(int n , int r ){
         int fact_n = factorial(n);
         int fact_r = factorial1(r);
         int fact_nmr = factorial(n-r);
   }
    public static void main( String args[]){
    Scanner sc = new Scanner( System.in);
    System.out.println("Enter n :"); 
    int n = sc.nextInt();
    System.out.println("Enter r :"); 
    int r = sc.nextInt();
    // int fact = factorial(n);
    // System.out.println("factorial is : " + fact);
     factorial(n);
     factorial(r);

    }
}
