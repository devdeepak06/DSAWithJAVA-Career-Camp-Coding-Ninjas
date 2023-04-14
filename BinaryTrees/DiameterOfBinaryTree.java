package BinaryTrees;



public class DiameterOfBinaryTree {
    //diameter of a binary tree
    public static int diameter(BinaryTreeNode<Integer> root){
        //Your code goes here
        if (root == null) {
            return 0;
        }
        int leftRightHeight = height(root.left) + height(root.right);
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        return 1 + Math.max(leftRightHeight, Math.max(leftDiameter, rightDiameter));
    }

    //height of a binary tree
    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {

    }
}
