package BinaryTrees;

import java.util.LinkedList;
import java.util.Scanner;

class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }

}

class Queue<T> {
    private LinkedList<T> data;

    public Queue() {
        data = new LinkedList<T>();
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void enqueue(T element) {
        data.addLast(element);
    }

    public T add(T element) {
        data.addLast(element);
        return element;
    }

    public T dequeue() {
        if (data.isEmpty()) {
            return null;
        }
        return data.removeFirst();
    }

    public T front() {
        if (data.isEmpty()) {
            return null;
        }
        return data.getFirst();
    }
}

public class BinaryTreeUse {
    // Print Levelwise binary tree
    //Sample Input 1:
    //10 20 30 40 50 -1 60 -1 -1 -1 -1 -1 -1 
    //Sample Output 1:
    //10
    //20 30
    //40 50 60
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        
    }

    // Simple Print Function for Binary Tree
    public static void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }

    // Takeinput level wise using queue
    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter root data");
            int rootData = s.nextInt();
            if (rootData == -1) {
                return null;
            }
            BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
            Queue<BinaryTreeNode<Integer>> pendingNodes = new Queue<BinaryTreeNode<Integer>>();
            pendingNodes.add(root);
            while (!pendingNodes.isEmpty()) {
                BinaryTreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("Enter left child of " + frontNode.data);
                int leftChild = s.nextInt();
                if (leftChild != -1) {
                    BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
                    frontNode.left = child;
                    pendingNodes.add(child);
                }
                System.out.println("Enter right child of " + frontNode.data);
                int rightChild = s.nextInt();
                if (rightChild != -1) {
                    BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
                    frontNode.right = child;
                    pendingNodes.add(child);
                }
            }
            return root;
        }
    }

    // Takeinput level wise using recursion
    public static BinaryTreeNode<Integer> takeInputLevelWiseRec() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter root data");
            int rootData = s.nextInt();
            if (rootData == -1) {
                return null;
            }
            BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
            BinaryTreeNode<Integer> leftChild = takeInputLevelWiseRec();
            BinaryTreeNode<Integer> rightChild = takeInputLevelWiseRec();
            root.left = leftChild;
            root.right = rightChild;
            return root;
        }
    }

    // Takeinput
    public static BinaryTreeNode<Integer> takeInput() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter root data");
            int rootData = s.nextInt();
            if (rootData == -1) {
                return null;
            }
            BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
            BinaryTreeNode<Integer> leftChild = takeInput();
            BinaryTreeNode<Integer> rightChild = takeInput();
            root.left = leftChild;
            root.right = rightChild;
            return root;
        }
    }

    // Detailed print function for binary tree
    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ",");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }

    // Construct tree using inorder and preorder
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        return buildTree(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length - 1);
    }

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder, int preS, int preE, int inS,
            int inE) {
        if (preS > preE) {
            return null;
        }
        int rootData = preOrder[preS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        int rootIndex = -1;
        for (int i = inS; i <= inE; i++) {
            if (inOrder[i] == rootData) {
                rootIndex = i;
                break;
            }
        }
        if (rootIndex == -1) {
            return null;
        }
        int leftInS = inS;
        int leftInE = rootIndex - 1;
        int leftPreS = preS + 1;
        int leftPreE = leftInE - leftInS + leftPreS;
        int rightInS = rootIndex + 1;
        int rightInE = inE;
        int rightPreS = leftPreE + 1;
        int rightPreE = preE;
        root.left = buildTree(preOrder, inOrder, leftPreS, leftPreE, leftInS, leftInE);
        root.right = buildTree(preOrder, inOrder, rightPreS, rightPreE, rightInS, rightInE);
        return root;
    }

    // Build Tree from preOrder and Inorder
    public static BinaryTreeNode<Integer> buildTreeFromPreIn(int[] preOrder, int[] inOrder) {
        BinaryTreeNode<Integer> root = buildTreeFromPreInHelper(preOrder, inOrder, 0, preOrder.length - 1, 0,
                inOrder.length - 1);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTreeFromPreInHelper(int[] preOrder, int[] inOrder, int preS, int preE,
            int inS, int inE) {
        if (preS > preE) {
            return null;
        }
        int rootData = preOrder[preS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        int rootIndex = -1;
        for (int i = inS; i <= inE; i++) {
            if (inOrder[i] == rootData) {
                rootIndex = i;
                break;
            }
        }
        if(rootIndex == -1){
        return null;
        }
        int leftInS = inS;
        int leftInE = rootIndex - 1;
        int leftPreS = preS + 1;
        int leftPreE = leftInE - leftInS + leftPreS;
        int rightInS = rootIndex + 1;
        int rightInE = inE;
        int rightPreS = leftPreE + 1;
        int rightPreE = preE;
        BinaryTreeNode<Integer> left = buildTreeFromPreInHelper(preOrder, inOrder, leftPreS, leftPreE, leftInS,
                leftInE);
        BinaryTreeNode<Integer> right = buildTreeFromPreInHelper(preOrder, inOrder, rightPreS, rightPreE, rightInS,
                rightInE);
        root.left = left;
        root.right = right;
        return root;
    }

    // Take Input better
    public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of " + parentData);
            } else {
                System.out.println("Enter right child of " + parentData);
            }
        }
        try (Scanner s = new Scanner(System.in)) {
            int rootData = s.nextInt();
            if (rootData == -1) {
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

    // Number of nodes
    public static int numNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftCount = numNodes(root.left);
        int rightCount = numNodes(root.right);
        return 1 + leftCount + rightCount;
    }

    //Construct tree using postOrder and Inorder
    public static BinaryTreeNode<Integer> buildTreePostIn(int[] postOrder, int[] inOrder) {
        BinaryTreeNode<Integer> root = buildTreePostInHelper(postOrder, inOrder, 0, postOrder.length - 1, 0,
                inOrder.length - 1);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTreePostInHelper(int[] postOrder, int[] inOrder, int postS, int postE,
            int inS, int inE) {
        if (postS > postE) {
            return null;
        }
        int rootData = postOrder[postE];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        int rootIndex = -1;
        for (int i = inS; i <= inE; i++) {
            if (inOrder[i] == rootData) {
                rootIndex = i;
                break;
            }
        }
        if (rootIndex == -1) {
            return null;
        }
        int leftInS = inS;
        int leftInE = rootIndex - 1;
        int leftPostS = postS;
        int leftPostE = leftInE - leftInS + leftPostS;
        int rightInS = rootIndex + 1;
        int rightInE = inE;
        int rightPostS = leftPostE + 1;
        int rightPostE = postE - 1;
    
        BinaryTreeNode<Integer>left = buildTreePostInHelper(postOrder, inOrder, leftPostS, leftPostE, leftInS, leftInE);
        BinaryTreeNode<Integer>right = buildTreePostInHelper(postOrder, inOrder, rightPostS, rightPostE, rightInS, rightInE);
        root.left = left;
        root.right = right;
        return root;
    }


    public static void main(String[] args) {
        // BinaryTreeNode<Integer> root = takeInputBetter(true, 0, true);
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        // BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
        // BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
        // root.left = rootLeft;
        // root.right = rootRight;
        // BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
        // BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
        // rootLeft.right = twoRight;
        // rootRight.left = threeLeft;
        // printTree(root);

        // printTreeDetailed(root);
        // printTreeDetailed(root);

        // System.out.println("Number of nodes: " + numNodes(root));
        // int inOrder[] = { 4, 2, 5, 1, 3 };
        // int preOrder[] = { 1, 2, 4, 5, 3 };
        int postOrder[] = { 4, 5, 2, 6, 7, 3, 1 };
        int inOrder[] = { 4, 2, 5, 1, 6, 3, 7 };

        // BinaryTreeNode<Integer> root = buildTreeFromPreIn(preOrder, inOrder);
        BinaryTreeNode<Integer> root = buildTreePostIn(postOrder, inOrder);
        printTreeDetailed(root);

    }
}
