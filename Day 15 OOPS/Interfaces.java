public class Interfaces {
    public static void main(String args[]){
       Queen q = new Queen();
       q.moves();
    }
    Student s1 = new Student();
    s1.SchoolName = "jmv ";
} 
interface chessPlayer {
    void moves();
}
class Queen implements chessPlayer{
       public void moves() {
            System.out.println("up,down,left,right,diagonal(all four dir)");
        }
}
    class Rook implements chessPlayer{
      public void moves(){
        System.out.println("up,down,left,right(all direction)");
      }
    }

    class Student {
        String name;
        int roll;

        static String SchoolName;
        void setName(String name){
            this.name = name;

        }
        String getName() {
            return this.name;
        }
    }

