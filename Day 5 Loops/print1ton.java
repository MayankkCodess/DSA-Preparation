import java.util.*;

public class print1ton {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    int counter = 1;

   
    while(counter <=n){
      System.out.println(counter);
      counter++;
    }
    System.out.println("Numbers are printed from 1 to n");
    }
}
