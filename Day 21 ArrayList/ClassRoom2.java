import java.util.ArrayList;
public class ClassRoom2 {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>>MainList = new ArrayList<>();
        //Declaring sub part 1
        ArrayList<Integer>list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(9);
        MainList.add(list);
        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(10);
        MainList.add(list2);
        //Printing elements from List 
        for(int i = 0; i<MainList.size();i++){
            ArrayList<Integer> currList = MainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(MainList);
    }
}
