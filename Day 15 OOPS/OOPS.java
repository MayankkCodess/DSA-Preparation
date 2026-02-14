public class OOPS {
public static void main(String args[]){
    Pen p1 = new Pen();// Creating the objects
    p1.setColor("blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    p1.color = "yellow";
    System.out.println(p1.color);
}
}

class Pen {
     // attributes +  functions

    String color;
    int tip;

     void setColor(String newColor){
        color = newColor;

     }
     void setTip(int newTip){
        tip = newTip;
     }


}

class Student {
    String name;
    int age;
    float percentage;  //cgpa

    void calcPercentage(int phy, int chem, int maths){
        percentage = (phy+ chem+ maths)/3;
    }
}