import java.util.*;
public class BST2 {
    static class Node{
        int data;
        Node left , right;

        Node(int data){
            this.data = data;
            this.left =this.right = null;
        }
    }
    public static void preorder(Node root){
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void getInOrder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInOrder(root.left, inorder);
        inorder.add(root.data);
        getInOrder(root.right, inorder);
    }
    public static Node createBST(ArrayList<Integer> inorder, int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st+ end)/2;
        Node root = new Node(inorder.get(mid));
         root.left=  createBST(inorder, st, mid-1);
         root.right = createBST(inorder, mid+1, end);
        return root;   
    }
    public static Node inorder(Node root){
        //inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInOrder(root, inorder);
        //sorted inorder -> balanced BST
          root = createBST(inorder, 0, inorder.size()-1);
          return root;
    }
    static class Info{
        boolean isBST ;
        int size;
        int min;
        int max;

        public Info(boolean isBST , int size , int min, int max){
            this.isBST = isBST;
            this.size  = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = 0;

    public static Info largestBST(Node root){
        if(root == null){
            return new Info(true , 0 ,Integer.MAX_VALUE , Integer.MIN_VALUE); 
        }
       Info leftInfo =  largestBST(root.left);
       Info rightInfo = largestBST(root.right);
       int size = leftInfo.size + rightInfo.size + 1;
       int min = Math.min(root.data , Math.min(leftInfo.min , rightInfo.min)) ;
       int max = Math.max(root.data, Math.max(leftInfo.max , rightInfo.max));

       if(root.data <= leftInfo.max || root.data >= rightInfo.max){
        return new Info(false, size, min, max);
       }
       if(leftInfo.isBST && rightInfo.isBST){
        maxBST = Math.max(maxBST , size);
        return new Info(true, size, min, max);
       }
       return new Info(false, size, min, max); 
    }
    public static void main(String args[]){
        int arr[]  = {3,5,6,8,10,11,12};
        
        
    } 
}
