public class manyPattern {

    public static void invertedpyramid(int n){
        for(int i =1 ; i<= n ; i++){
            for(int j = 1 ; j<= n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int n){
        int counter = 1; 
        for(int i = 1; i<=n ; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void Zero_oneTriangle(int n){
        for(int row = 1 ; row<= n; row++){
            for(int col = 1 ; col<= row ; col++){
                if((row+col) % 2 ==0){
                    System.out.print("1" + " ");
                }else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
         for(int i = 1; i<=n; i++){
            //star
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i);j++){
                System.out.print(" ");
            }   
            for(int j = 1; j<=i ; j++){
          System.out.print("*");
            }
            System.out.println();
         }

         for(int i = n ; i>=1; i--){
              //star
              for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i);j++){
                System.out.print(" ");
            }   
            for(int j = 1; j<=i ; j++){
          System.out.print("*");
            }
            System.out.println();
         }

         }
    
    public static void main(String[] args) {
        // invertedpyramid(3);
        System.out.println();
        // floydTriangle(5);
        Zero_oneTriangle(9);
        butterfly(4);
    }
}
