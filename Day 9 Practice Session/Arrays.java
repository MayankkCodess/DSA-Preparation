public class Arrays {

    public static void change(int var){
        var = 20;
        System.out.println("value in function definition is : " + var);
    }
    public static void main(String[] args) {
        int var = 10; 
        System.out.println("Real var value: " + var);

        change(var);
        System.out.println("value after function calling :" +var);
        
    }
}