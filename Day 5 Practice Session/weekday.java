import java.util.*;
public class weekday {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int daynumber = sc.nextInt();
        switch (daynumber) {
            case 1 , 2, 3, 4, 5: {System.out.println("weekday");
            break;
        }
            case 6 , 7: {
                System.out.println("weekend ");
                break;
            }    
              
            default: {
            
                System.out.println("invalid day");
            }
                
        
    }
}
}
