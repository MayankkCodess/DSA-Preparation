import java.util.*;
public class Arrayinputs {
    public static void main(String args[]){
       int marks[] = new int[50];
       Scanner sc = new Scanner(System.in);

       // Simple variable declaration 
       //int marks ;
       //int marks = sc.nextInt();
       marks[0]= sc.nextInt();
       marks[1]= sc.nextInt();
       marks[2]= sc.nextInt();

       System.out.println("phy =" + marks[0]);
       System.out.println("chem =" + marks[1]);
       System.out.println("maths =" + marks[2]);

    //    marks[2] = 100;
    marks[2] = marks[2] +1;
       System.out.println("maths=" + marks[2]);
    
       int percentage= (marks[0] + marks[1] + marks[2])/3;
       System.out.println("percentage = " + percentage +"%");

       System.out.println("length of an array = " + marks.length);
    }
}
