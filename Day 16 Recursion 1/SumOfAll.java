public class SumOfAll {
    public static int calcFibonacci(int n){
        int fibN;
    if(n==0||n==1){
        // return n;
        return n==0?0:1;
    }
     fibN = calcFibonacci(n-1) + calcFibonacci(n-2);
    return fibN;

    }
    public static int sumNatural(int n){
        if(n==1){
            return 1;
        }
        int sumMinus1= sumNatural(n-1);
        int sum = n+sumMinus1;
        return sum;
    }
    public static void main(String args[]){
        int n =25;
        // System.out.println(sumNatural(n));
        System.out.println(calcFibonacci(n));
    }
}
