public class trapped_rainwater {

    public static int trappedRainwater(int height[]){
        // left max loop 

        for(int i = 0 ; i< height.length ; i++){
           int left_max[i] = Math.max(height[i],left_max[i-1]);
           


        }
        // right max loop 

    }
    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3 , 2, 5};
        System.out.println(trappedRainwater(height));
    }
}