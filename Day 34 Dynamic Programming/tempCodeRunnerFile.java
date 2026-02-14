public class fibonacci{
    public static int fib(int n, int f[]){
        if(n==0|| n===1){
            return n;
        }
        if(f[n] != 0){ // fib(n) is already calculated
            return f[n];
        }
        f[n] = fib(n-1, f) + fib(n-2,f);
        return f[n];
    }
    public static int fibTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] =0;