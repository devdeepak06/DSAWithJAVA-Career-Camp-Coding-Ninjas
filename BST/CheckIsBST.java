
public class CheckIsBST {
    public static int maxData(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = maxData(root.left);
        int rightMax = maxData(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }
    
    public static int minData(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int leftMin = minData(root.left);
        int rightMin = minData(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }
    public static boolean isBST(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftMax = maxData(root.left);
        if (root.data <= leftMax) {
            return false;
        }
        int rightMin = minData(root.right);
        if (root.data > rightMin) {
            return false;
        }
        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);
        if (isLeftBST && isRightBST) {
            return true;
        } else {
            return false;
        }
    }

    //Implement the function here
    public static IsBSTReturn isBST2(BinaryTreeNode<Integer> root) {
        if (root == null) {
            IsBSTReturn output = new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
            return output;
        }
        IsBSTReturn leftOutput = isBST2(root.left);
        IsBSTReturn rightOutput = isBST2(root.right);

        int min = Math.min(root.data, Math.min(leftOutput.min, rightOutput.min));
        int max = Math.max(root.data, Math.max(leftOutput.max, rightOutput.max));
        boolean isBST = true;
       
        if (leftOutput.max >= root.data) {
            isBST = false;
        }
        if (rightOutput.min < root.data) {
            isBST = false;
        }
        if (!leftOutput.isBST) {
            isBST = false;
        }
        if (!rightOutput.isBST) {
            isBST = false;
        }
        IsBSTReturn output = new IsBSTReturn(min, max, isBST);
        return output;
    }
    //Implement the function here
    public static boolean isBST3(BinaryTreeNode<Integer> root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        boolean isLeftBST = isBST3(root.left, min, root.data - 1);
        boolean isRightBST = isBST3(root.right, root.data, max);
        return isLeftBST && isRightBST;
    }

    public static void main(String[] args) {
        BinaryTreeNode <Integer> root = new BinaryTreeNode<>(4);
        root.left = new BinaryTreeNode<>(2);
        root.right = new BinaryTreeNode<>(6);
        root.left.left = new BinaryTreeNode<>(1);
        root.left.right = new BinaryTreeNode<>(3);
        root.right.left = new BinaryTreeNode<>(50);
        root.right.right = new BinaryTreeNode<>(7);

        // System.out.println(isBST(root));
        // IsBSTReturn output = isBST2(root);
        // System.out.println(output.min + " " + output.max + " " + output.isBST);


        System.out.println(isBST3(root , Integer.MIN_VALUE, Integer.MAX_VALUE));



    }
}
