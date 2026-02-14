import java.util.*;

public class HashSetClass{
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2); 
        System.out.println(set);

        if(set.contains(1)){
            System.out.println("set contains 1");

        }
        if(set.contains(2)){
          System.out.println("set contains 2 "
          );
        }
        // set.remove(2);
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);

       HashSet<String>cities = new HashSet<>();
       cities.add("Delhi");
       cities.add("Mumbai");
       cities.add("Noida");
       cities.add("Bengaluru");

       Iterator itr = cities.iterator();

       while(itr.hasNext()){
        System.out.println(itr.next());
       }
       for(String city:cities){
        System.out.println(city);
       }
       LinkedHashSet<String> lhs = new LinkedHashSet<>();
       lhs.add("Mumbai");
       lhs.add("Noida");
       lhs.add("Bengaluru");
       lhs.add("Delhi");
       System.out.println(lhs);
    }
}