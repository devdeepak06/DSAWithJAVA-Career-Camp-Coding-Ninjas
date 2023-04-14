
import java.util.ArrayList;
import java.util.Scanner;

public class NodeToRootPath {
    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftOutput = nodeToRootPath(root.left, data);
        if (leftOutput != null) {
            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput = nodeToRootPath(root.right, data);
        if (rightOutput != null) {
            rightOutput.add(root.data);
            return rightOutput;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(4);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(5);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<Integer>(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        try (Scanner s = new Scanner(System.in)) {
            int data = s.nextInt();
            ArrayList<Integer> output = nodeToRootPath(root, data);
            if (output != null) {
                for (int i : output) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

// Sample Input 1:
// 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1