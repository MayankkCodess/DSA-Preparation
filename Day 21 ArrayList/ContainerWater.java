import java.util.*;
public class ContainerWater {
    
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        //Brute Force
        int maxContainer = Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++){
         for(int j=i+1;j<height.size();j++){
            int heightOfTwo = Math.min(height.get(i), height.get(j));
            int width = j-i;
            int water = heightOfTwo * width;
            maxContainer = Math.max(maxContainer,water);
         }
        }
       System.out.println(maxContainer);
    }
}
