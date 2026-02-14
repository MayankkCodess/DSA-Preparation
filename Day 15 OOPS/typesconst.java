public class typesconst {
    public static void main(String args[]){
    Student s1 = new Student();
    s1.name = "mayank";
    s1.roll = 456;
    // Student s2 = new Student("Shradha");
    // Student s3 = new Student(123);
    Student s4 = new Student(s1);
     s4.password = "xyz";
    
    }
}
class Student{
    String name;
    int roll;
    String password ;

    //Copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student() {
        System.out.println("constructor has been called :"
        );
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
