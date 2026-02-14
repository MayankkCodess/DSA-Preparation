import java.util.*;
public class Arrayrefernce {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.print("Enter your 5 Numbers :");
        for(int i = 0 ; i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        //Printing the input array
        System.out.println("Your array after inputs is :" );
        for(int i = 0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }
    }
}