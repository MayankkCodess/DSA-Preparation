import java.util.ArrayList;

public class StackRevision {
   
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     public static boolean isEmpty(){
    //         return list.size() ==0;
    //     }
    //    //push
    //    public static void push(int data){
    //     list.add(data);
    //    } 
    //    //pop
    //    public static int pop(){
    //     int top = list.get(list.size()-1);
    //     list.remove(list.size()-1);
    //     return top; 
    //    }
    //    //peek
    //    public static int peek(){
    //     return list.get(list.size()-1); 
    //    }
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
 static class Stack{
    static Node head =null ;
    }
    //isEmpty
    public static boolean isEmpty(){
        return head == null;
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}