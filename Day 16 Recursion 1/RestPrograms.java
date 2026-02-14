public class RestPrograms {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int factminus1 = fact(n-1);
        int fact = n * factminus1;
        return fact;
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
      int summinus1 = sum(n-1);
      int sum = n+ summinus1;
      return sum;
    }

    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fibminus1 = fib(n-1);
        int fibminus2 = fib(n-2);
        int fib = fibminus1 + fibminus2;
        return fib;
    }

    public static int firstOccurence(int arr[],int key, int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static boolean isSorted( int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int lastOccurence(int arr[],int key,int i){
       if(i==0){
        return -1;
       }
        if(arr[i] == key){
        return i;
       }

       return lastOccurence(arr, key, i-1);

    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }

        return x* power(x, n-1);
    }
    public static void main(String args[]){
        // int n= 6;
        // System.out.println(fact(n));
        // System.out.println(sum(n));
        // System.out.println(fib(n));
        // int arr[] = {2,4,6,8,9,10};
        // System.out.println(isSorted(arr,0));
        int arr[] = {3,2,8,9,38,2,5,8,3,5,10};
        // System.out.println(firstOccurence(arr,5, 0));
        System.out.println(lastOccurence(arr,5, arr.length-1));
    }
}
