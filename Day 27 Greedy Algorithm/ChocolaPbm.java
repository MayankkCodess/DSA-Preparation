import java.util.*;
public class ChocolaPbm {
    public static void main(String args[]){
        int n=4,m=6;
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVer , Collections.reverseOrder());
        Arrays.sort(costHor , Collections.reverseOrder());

        int hcut=0,vcut=0; //pointers
        int hpieces= 0,vpieces=0;
        int cost =0;
        while(hcut<costHor.length && vcut<costVer.length){
            if(costVer[vcut] <= costHor[hcut]){
                //horizontal cut
                cost += (costHor[hcut] * vpieces);
                hpieces++;
                hcut++;
            }else{
                //vertical cut
                cost += (costVer[vcut] * hpieces);
                vpieces++;
                vcut++;
            }
        }
        while(hcut<costHor.length){
                cost += (costHor[hcut] * vpieces);
                hpieces++;
                hcut++;
        }
        while(vcut < costVer.length){
             cost += (costVer[vcut] * hpieces);
                vpieces++;
                vcut++;
        }
        System.out.println("min cost of cuts =" + cost);
    }
}
