public class ProductAB{

    public static int multiply(int a , int b ){
         int product = a*b;
            return product;

    }
    public static void main(String args[]){
        int a = 7 ; 
        int b = 9 ; 
        // multiply(a, b);
        int product = multiply(a, b );
        System.out.println("Product is :" + product);

      product = multiply(10,20);
      System.out.println("product is " + product);
    }
    
}
