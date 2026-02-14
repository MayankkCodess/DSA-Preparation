import java.util.*;
public class palindrome {

    public static int isPalindrome(int num){
        int palNum = 0; 
        int pow = 0 ; 
        while(num>0){
            int rem = num %10;
            palNum = palNum + rem * (int)Math.pow(10, pow);
            num = num / 10;
            pow++;

        }
        return palNum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter your number :");
        int num = sc.nextInt();

        int reverseNum = isPalindrome(num);
        if(reverseNum==num){
            System.out.println("Entered number is Palindrome");

        }else{
            System.out.println("your number is not palindrome");
        }

    }
}