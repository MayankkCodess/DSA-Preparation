import java.util.*;
public class printallsubarrays {

    public static void print_subarray(int arr[]){
         
        for(int i = 0; i<arr.length; i++){
            for(int j= i; j<arr.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
         int arr[] = new int[5];
         for(int i= 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
         }

         print_subarray(arr);
    }
}
