public class Arrayasfunction {

    public static void update(int marks[], int nonchangable){
        nonchangable  = 10;
        // Increase the value of each index by one
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i]+2;

        }
    }
    public static void main(String args[]){
        int marks[] = {98, 97, 98};
        int nonchangable = 8;
        update(marks,nonchangable);
        // concept of functioncalling in java
        System.out.println(nonchangable);
        
        //for printing the updated array
        for(int i = 0 ; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
