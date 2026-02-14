import java.util.*;
public class prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();
       

        if(n==2){
            System.out.println("your number is prime");
        }else{
           
            boolean isPrime = true;
            for(int i= 2; i<=n-1 ; i++){
                if(n % i==0){
                    isPrime = false;
                }

                if(isPrime = false){
                    System.out.println("Your number is not prime");
                }else{
                    System.out.println("Your number is  prime");
                }    
    
            }
            
        }
         
       
    }
}

