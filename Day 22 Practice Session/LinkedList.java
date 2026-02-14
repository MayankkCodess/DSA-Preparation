import java.util.*;
class Node {
    int val ;
    Node next;

    public Node (int val){
        this.val = val;
        this.next = null;
    }

  }
public class LinkedList {
  
   
    public static void main(String args[]){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        n1.next = n2;
        n2.next = n3;

        Node head = n1;
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
    }
}