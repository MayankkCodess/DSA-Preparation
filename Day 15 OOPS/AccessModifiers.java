public class AccessModifiers {
    public static void main(String args[]){
      BankAccount myAcc = new BankAccount();
      myAcc.userName = "Mayank Kaushik";
      System.out.println(myAcc.userName);
      myAcc.password = "  "; // Not Visible
      myAcc.setPassword("abcdefghi");

    }
    
}
class BankAccount {
    public String userName ;
    private String password ; 
    public void setPassword(String pwd){
        password = pwd;
    }

}
 
class Pen {
    String color;
    int tip; 
    String getColor() {
        return  this.color;

    }
    int getTip() {
        return this.tip;
        
    }
}