import java.util.ArrayList;

public class ArrayListClass{
    public static void swap(ArrayList<Integer> list, int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1 , list.get(idx2));
        list.set(idx2 , temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list.size());
        //print the arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        //Reverse ArrayList
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //Maximum in List 
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<=list.size()-1;i++){
            if(list.get(i)>largest){
                largest = list.get(i);
            }
        }
        System.out.println("Largest Elem ent is:" + largest);
        // Swap two numbers
        int idx1 =1 , idx2 = 3;
       
    }
}