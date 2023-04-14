package BinaryTrees;
import java.util.Scanner;
class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;
    
    public BinaryTreeNode (T data){
        this.data = data;
        this.left = null;
        this.right = null;

    }
    
}
public class IsNodePresent {

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        }
        boolean ans = isNodePresent(root.left, x);
        if(ans){
            return true;
        }
        return isNodePresent(root.right, x);
	}

    //take input better
    public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data");
        }else{
            if(isLeft){
                System.out.println("Enter left child of " + parentData);
            }else{
                System.out.println("Enter right child of " + parentData);
            }
        }
        try (Scanner s = new Scanner(System.in)) {
            int rootData = s.nextInt();
            if(rootData == -1){
                return null;
            }
            BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
            BinaryTreeNode<Integer> leftChild = takeInputBetter(false, rootData, true);
            BinaryTreeNode<Integer> rightChild = takeInputBetter(false, rootData, false);
            root.left = leftChild;
            root.right = rightChild;
            return root;
        }
    }

    //print tree detailed
    public static void printTreeDetailed(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + ":");
        if(root.left != null){
            System.out.print("L" + root.left.data + ",");
        }
        if(root.right != null){
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }


    //main
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputBetter(true, 0, true);
        printTreeDetailed(root);
        System.out.println(isNodePresent(root, 5));
    }


}
