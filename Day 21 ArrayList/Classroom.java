import java.util.Collections;
import java.util.ArrayList;
public class Classroom{
    public static void swap(ArrayList<Integer>listMain,int idx1, int idx2){
        int temp = listMain.get(idx1);
        listMain.set(idx1,listMain.get(idx2));
        listMain.set(idx2,temp);
    }
public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list1 = new ArrayList<>();
    //Add Operation
    list.add(1);
    list.add(2);
    list.add(4);
    list.add(7);
    list.add(9);
    list.add(10);
    System.out.println(list);
    //Get Operation
    int element = list.get(2);
    System.out.println(element);
    //Remove Element 
    list.remove(2);
    System.out.println(list);
    //Set 
    list.set(2,10);
    System.out.println(list);
    //contains
    list.contains(1);
    list.contains(3);
    System.out.println(list.contains(1));
    System.out.println(list.contains(3));
    // Size of an ArrayList
    System.out.println(list.size());
    //For printing the arraylist
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i) + " ");
    }
    System.out.println();
    //Reverse an ArrayList
    ArrayList<Integer> listMain = new ArrayList<>();
    listMain.add(1);
    listMain.add(2);
    listMain.add(9);
    listMain.add(4);
    listMain.add(5);
    //Printing the reverse list    
    // for(int i= listMain.size()-1; i>=0;i--){
    //     System.out.print(listMain.get(i) + " ");
    // }
    // System.out.println();
    // int max = Integer.MIN_VALUE;
    // for(int i=0; i<list.size();i++){
    //     if(max < list.get(i)){
    //         max = list.get(i);
    //     }
    // }
    // System.out.println("max element is:-"+max);
    // Swap 2 Numbers
    int idx1 = 1, idx2 = 3;
    System.out.println(listMain);
    swap(listMain, idx1, idx2);
    System.out.println(listMain);
    //Sorting the ArrayList
    Collections.sort(listMain);
    Collections.sort(listMain,Collections.reverseOrder());
    System.out.println(listMain);

    }
}