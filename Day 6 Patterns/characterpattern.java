import java.util.*;
public class characterpattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter your Number : ");
        int num = sc.nextInt();
          char ch = 'A';
          for(int i = 1; i<= num; i++){
            for(int chars = 1 ; chars <= i; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
          }
    }
}
