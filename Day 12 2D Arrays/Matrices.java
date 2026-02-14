 import java.util.*;
 public class Matrices  {

    public static boolean search(int Matrix[][], int key){
        for(int i = 0; i<Matrix.length; i++){
            for(int j = 0 ; j<Matrix[0].length; j++){
                  if(Matrix[i][j] == key){
                    System.out.println("Key found at cell no("+i+"," +j+")");
                    return true;
                  }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[]){
        int Matrix[][] = new int[3][3];
        int n = Matrix.length, m = Matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<n; i++){
            for(int j = 0; j<m; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i = 0 ; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(Matrix, 4);
    }
 }