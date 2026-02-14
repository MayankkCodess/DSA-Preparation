import java.util.*;
public class Classroom{
   public static void main(String args[]){
    //Create
    HashMap<String,Integer> hm = new HashMap<>();
    //Put
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);

    System.out.println(hm);

    //get 
    int population = hm.get("India");
    System.out.println(population);
    System.out.println(hm.get("Indonesia"));

    //containsKey - O(1)
    System.out.println(hm.containsKey("India"));
    System.out.println(hm.containsKey("Indonesia"));

    //Remove
    // System.out.println(hm.remove("India"));

    //Size 
    System.out.println(hm.size());

    //isEmpty
    System.out.println(hm.isEmpty());

    //Clear
    // hm.clear();
    // System.out.println(hm.isEmpty());

    //Iterate
    Set<String>Keys = hm.keySet();
    // System.out.println(Keys); 

    
   for (String k : Keys){
    System.out.println("key ="+k+", values ="+hm.get(k)); 
   }
   }
}