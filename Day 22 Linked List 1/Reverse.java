public class Reverse { 
    public void reverseDLL(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next; 
            prev = curr;
            curr = next;
        } 
    }
    public static void main(String args[]){

    }
}