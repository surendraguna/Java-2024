
import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static Node root = null;
    public static Node main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter choice");
            choice = inp.nextInt();
            switch (choice) {
                case 1 -> insert();
                case 2 -> {
                    // root left right
                    preOrder(root);
                    System.out.println();
                }
                case 3 -> {
                    preOdderNonRecursive();
                    System.out.println();
                }
                case 4 -> {
                    //left root right
                    inOrder(root);
                    System.out.println();
                }
                case 5 -> {
                    inOrderNonRecursive();
                    System.out.println();
                } 
                case 6 -> {
                    //left right root
                    postOrder(root);
                    System.out.println();
                }
                case 7 -> {
                    postOrderNonRecursive();
                    System.out.println();
                }
                case 8 -> {
                    levelOrderTraversal();
                    System.out.println();
                }         

            }
            
        } while (choice != 0);  
        
        inp.close(); 
        return root;
             
    }

    static void levelOrderTraversal(){
        ArrayList<Node> queue =  new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.removeFirst();
            System.out.print(temp.data + " ");
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }

    static void postOrderNonRecursive(){
        Node temp = root;
        ArrayList<Node> stack = new ArrayList<>();
        while(true){
            while (temp != null) {
                stack.add(temp);
                stack.add(temp);
                temp = temp.left;                
            }
            if(stack.isEmpty())
                break;
            temp = stack.removeLast();
            if(!stack.isEmpty() && stack.get(stack.size() - 1) == temp){
                temp = temp.right;
            } else {
                System.out.print(temp.data + " ");
                temp = null;
            }
        }
    }

    static void inOrderNonRecursive(){
        Node temp = root;
        ArrayList<Node> stack = new ArrayList<>();
        while (true) {  
            while (temp != null) {
                stack.add(temp);
                temp = temp.left;
            }
            if(stack.isEmpty()){
                break;
            }
            temp = stack.removeLast();
            System.out.print(temp.data + " ");
            temp = temp.right;
            
        }
    }    

    static void preOdderNonRecursive() {
        Node temp = root;
        ArrayList<Node> stack = new ArrayList<>();
        while(true){
            while (temp != null) {
                System.out.print(temp.data + " ");
                stack.add(temp);
                temp = temp.left;                
            }
            if(stack.isEmpty())
                break;
            temp = stack.removeLast();
            temp = temp.right;           
        }
    }

    static void preOrder(Node root) {
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
        
    }

    static void postOrder(Node root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    static Node insert() {
        root = new Node(10);
        root.left = new Node(21);
        root.right = new Node(32);
        root.left.left = new Node(44);
        root.left.right = new Node(5);
        root.right.left = new Node(16);
        root.right.right = new Node(7);
        root.left.left.left = new Node(18);
        root.left.left.right = new Node(29);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(141);
        root.right.left.left = new Node(122);
        root.right.left.right = new Node(132);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);
        return root;
    }
     
}
