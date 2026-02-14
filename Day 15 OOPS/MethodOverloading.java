public class MethodOverloading {
    public static void main(String args[]){
    Calculator calc = new Calculator();
    System.out.println(calc.sum((float)3.2, (float)3.1));
    Deer d = new Deer();
    d.eats();
    }
}
class Calculator {
    int sum(int a,int b){
        return a+b;

    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
}
class Animal{
    void eats(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal {
    void eats(){
        System.out.println("eats grass");
    }
}