public class AbstractClass {
    public static void main(String[] args) {
        
    }
}
abstract class Animal {
    void eats() {
        System.out.println("Animal eats ");

    }
    abstract void walk();
}
class Horse extends Animal {
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

