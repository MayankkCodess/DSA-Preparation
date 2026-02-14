import java.util.*;
public class timeconverter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int min = sc.nextInt();

        hour+=5;
        min+=30;

        if(min>60){
            hour++;
            min-=60;

        }
        if(hour>24){
            day++;
            hour-=24;


        }
        System.out.print("day :" + day +"hour :" + hour +"min :" +min );
    }
}
