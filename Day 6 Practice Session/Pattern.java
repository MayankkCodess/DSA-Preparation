// public class Pattern {
    
//     public static void main(String args[]){
//         int n = 5;

//         for( int row = 1; row<=n ; row++){
//             for(int col = 1; col<=n ; col++){
//                 if(row + col >n ){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }        


// public class Pattern {
    
//         public static void main(String args[]){
//             int n = 5;
    
//             for( int i = 1; i<=n ; i++){
//                 for(int j = 1; j<=i; j++){
//                     for(int k = 1; k <=n-i ; k++){
//                         System.out.print(" ");
//                     }
//                     System.out.print("*");
//                 }
//                 System.out.println();
//         }
//     }
// }            


public class Pattern {
    
        public static void main(String args[]){
            int n = 10;
    
            for( int row = 1; row<=n ; row++){
                for(int col = 1; col<=n ; col++){
                    if(row == col ){
                        System.out.print("*");
                    }else if(row + col == n+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }        
    
    