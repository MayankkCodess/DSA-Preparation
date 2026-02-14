public class BitwiseAll{
    public static void OddorEven(int n){
        int bitMask = 1;
        if( (n & bitMask) ==0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String args[]){
    System.out.println(5&6);
    System.out.println(5|6);
    System.out.println(5^6);
    System.out.println(~5);
    System.out.println(~0);
    System.out.println(5<<2);
    System.out.println(6>>1);
    OddorEven(4);
    }
}