import java.util.*;
public class fizzbuzz {
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();

          if(num%15==0){
            System.out.println("fizzbuzz");
          } else if(num%3==0){
            System.out.println("fizz");

          }else if(num%5==0){
            System.out.println("buzz");
          }else{
            System.out.println(num);
          }
    }
}