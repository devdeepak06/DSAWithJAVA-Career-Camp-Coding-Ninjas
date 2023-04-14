package BinaryTrees;

import java.util.Scanner;

public class BalancedBinaryTree {

    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        //Your code goes here
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        boolean leftBalanced = isBalanced(root.left);
        boolean rightBalanced = isBalanced(root.right);
        if (leftBalanced && rightBalanced) {
            return true;
        } else {
            return false;
        }
    }
    
    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
        //Your code goes here
        if (root == null) {
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = 0;
            ans.isBalanced = true;
            return ans;
        }
        BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);
        boolean isBalanced = true;
        if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
            isBalanced = false;
        }
        if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
            isBalanced = false;
        }
        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isBalanced = isBalanced;
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            BinaryTreeNode<Integer> root = takeInputBetter(s, true, 0, true);
            System.out.println(isBalanced(root));
        }

    }

    public static BinaryTreeNode<Integer> takeInputBetter(Scanner s, boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of " + parentData);
            } else {
                System.out.println("Enter right child of " + parentData);
            }
        }
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeInputBetter(s, false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeInputBetter(s, false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
}