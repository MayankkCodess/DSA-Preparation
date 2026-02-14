public class Topic2 {
     static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String words){ //0(L) time complexity
        Node curr = root;
        for(int level=0;level<words.length();level++){
            int idx = words.charAt(level)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }    
    public static void main(String args[]){
       String words[] = {"the", "a", "there", "their" , "any" , "thee"};
       for(int i=0;i<words.length;i++){
        insert(words[i]);
       }
    }
}
