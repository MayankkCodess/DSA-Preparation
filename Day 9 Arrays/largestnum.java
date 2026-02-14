public class largestnum {

    public static int largest_num(int num[]){
        int key= num[0];
        int smallest = Integer.MAX_VALUE;
        for(int i =0 ; i<num.length; i++){
            if(key<num[i]){
                key = num[i];
               }
               if(smallest > num[i]){
                smallest = num[i];
               }

        }
        System.out.println("Smallest no. in array is :" +smallest);
        return key;
    }
    public static void main(String args[]){
        int num[] = {2,4,6,18,10,12};
        largest_num(num);
        System.out.println("largest element in the given array is :" + largest_num(num));
    }
}


// Practice time
int marks[] = {1,2,3,4,5};
int Books[] = new int[50];

Scanner sc = new Scanner(System.in);

marks[0] = sc.nextInt();
System.out.println("Phy" + marks[0]);