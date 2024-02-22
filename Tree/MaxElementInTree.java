import java.util.ArrayList;
import java.util.Collections;

public class MaxElementInTree {
    public static void main(String[] args) {
        BinaryTree.Node root = BinaryTree.insert();
        //BinaryTree.inOrder(root); // Access the static method in a static way
        System.out.println(recursionMaxTree(root));
        ArrayList<Integer> s = new ArrayList<>();
        recursionMaxTree(root, s);
        Collections.sort(s);
        System.out.println(s);
    }
    static void recursionMaxTree(BinaryTree.Node root, ArrayList<Integer> s){
        if(root == null)
            return;
        recursionMaxTree(root.left, s);
        s.add(root.data);
        recursionMaxTree(root.right, s);

    }
    static int recursionMaxTree(BinaryTree.Node root){
        if(root == null)
            return Integer.MIN_VALUE;
        int left = recursionMaxTree(root.left);
        int right = recursionMaxTree(root.right);
        return Math.max(root.data, Math.max(left, right));
    }
    static int maxTree(BinaryTree.Node root){
        int val = Integer.MIN_VALUE;
        ArrayList<BinaryTree.Node> stack = new ArrayList<>();
        while (true) {
            while (root != null) {
                val = val < root.data ? root.data : val;
                stack.add(root);
                root = root.left;
            }
            if(stack.isEmpty()){
                break;
            }
            root = stack.removeLast();
            root = root.right;
        }
        return val;
    }    
}
