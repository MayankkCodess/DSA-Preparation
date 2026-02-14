import java.util.*;
public class BST{
    static class Node{
        int data;
        Node left , right;

        public Node(int data){
            this.data = data;
            Node left = null; //No need to write null by default
            Node right = null;
        }
    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            //left subtree
            root.left = insert(root.left ,val);
        }else{
            //right subtree
            root.right = insert(root.right ,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static boolean search(Node root , int key ){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true ;
        }
        if(root.data>key){
            return search(root.left, key);
        }
         else{
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
        }else{// voila
             // case -1 leaf node
             if(root.left == null && root.right == null){
                return null;
             }
             //case - 2 - single child
             if(root.left == null){
                return root.right;
             }else if(root.right == null){
                return root.left;
             }

             //case 3 - both children
             Node IS = findInorderSuccessor(root.right);
             root.data = IS.data;
             root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void printInRange(Node root , int k1 , int k2){
        if(root == null ){
            return ;
        }
        if(root.data >= k1  && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
    }else if(root.data < k1){
        printInRange(root.left, k1, k2);
    }else{
        printInRange(root.right,k1,k2);
    }
    }
    public static void printPath(ArrayList <Integer>Path){
        for(int i=0;i<Path.size();i++){
            System.out.print(Path.get(i) + "->");
        }
        System.out.println("NULL");
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer>Path){
        if(root == null){
            return ;
        }
        Path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(Path);
        }
        printRoot2Leaf(root.left, Path);
        printRoot2Leaf(root.right, Path);
        Path.remove(Path.size() - 1);
    }
    public static boolean isValidBST(Node root, Node min , Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data){
            return false;
        }
        return isValidBST(root.left, min, max) && isValidBST(root.right, min, max);
    }
    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror  = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root, 11)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
        root = delete(root, 5);
         System.out.println();

         inorder(root);
         printRoot2Leaf(root, new ArrayList<>());
         if(isValidBST(root, null, null)){
              System.out.println("Valid"); 
        }else{
            System.out.println("Not Valid");
        }
    }
}