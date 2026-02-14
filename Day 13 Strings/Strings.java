import java.util.*;
public class Strings {

    public static void printLetters(String str){
        for(int i=0 ; i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        //Strings are immutable


        Scanner sc = new Scanner(System.in);
        String name ;
        name = sc.nextLine();
        System.out.println(name );

        // String length printing

        System.out.println(str.length());

        // String concatenation

        String firstName = "Mayank";
        String lastName = "Kaushik";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);


        //charAt method 
        System.out.println(fullName.charAt(0));

        //printing all characters 
        printLetters(str);
    }
}