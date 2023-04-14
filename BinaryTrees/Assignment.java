package BinaryTrees;


class QueueEmptyException extends Exception {
}

class Pair<T, U> {
    T minimum;
    U maximum;

    public Pair(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}

class QueueUsingLL<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public QueueUsingLL() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T front() {
        if (size == 0) {
            return null;
        }

        return head.data;
    }

    public void enqueue(T element) {
        Node<T> newNode = new Node<T>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public T dequeue() {
        if (size == 0) {
            // Throw an exception
            return null;
        }

        T temp = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return temp;
    }

}

public class Assignment {
    // Assignment 1
    // Create and insert Duplicate node in a binary tree
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        // Your code goes here
        if (root == null)
            return;
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = newNode;
        newNode.left = temp;
        insertDuplicateNode(root.left.left);
        insertDuplicateNode(root.right);
    }

    // Assignment 2
    // Minimum and Maximum in the Binary Tree
    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        // Your code goes here
        if (root == null) {
            Pair<Integer, Integer> output = new Pair<Integer, Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE);
            return output;
        }
        Pair<Integer, Integer> leftOutput = getMinAndMax(root.left);
        Pair<Integer, Integer> rightOutput = getMinAndMax(root.right);
        int min = Math.min(root.data, Math.min(leftOutput.minimum, rightOutput.minimum));
        int max = Math.max(root.data, Math.max(leftOutput.maximum, rightOutput.maximum));
        Pair<Integer, Integer> output = new Pair<Integer, Integer>(min, max);
        return output;
    }
    
    // Assignment 3
    // LevelOrder Traversal
    //Sample Input 1 :
    // 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
    //Sample Output 1 :
    // 5
    // 6 10
    // 2 3 9
    public static void printLevelWise (BinaryTreeNode<Integer> root){
        //Your code goes here
        if(root == null){
            return;
        }
       System.out.println(root.data);
       if(root.left == null && root.right == null){
           return;
       }
         QueueUsingLL<BinaryTreeNode<Integer>> queue = new QueueUsingLL<BinaryTreeNode<Integer>>();
            queue.enqueue(root.left);
            queue.enqueue(root.right);
            
    }
    // Assignment 4
    //Path sum root to leaf
    //Sample Input 1 :
    // 2 3 9 4 8 2 4 6 -1 -1 -1 -1 -1 -1 -1 -1 -1
    // 13
    //Sample Output 1 :
    // 2 3 4 4
    // 2 3 8

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        // Your code goes here
        if(root == null){
            return;
        }
        String output = "";
        rootToLeafPathsSumToK(root, k, output);
    }
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String output){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(root.data == k){
                System.out.println(output + root.data);
            }
            return;
        }
        rootToLeafPathsSumToK(root.left, k - root.data, output + root.data + " ");
        rootToLeafPathsSumToK(root.right, k - root.data, output + root.data + " ");
    }

    //Assignment 5
    //Print nodes at distance k from node
    //Sample Input 1 :
    //5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
    //3 1
    //Sample Output 1 :
    //9 
    //6
    //Sample Input 2 :
    //1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
    //3 3
    //Sample Output 2 :
    //4 5

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		// Write your code here
        int x = print(root,k,node);
        if(x == -1){
            return;
        }
	}
    
    public static int print(BinaryTreeNode<Integer> root,int k,int elem){
        if(root == null){
            return -1;
        }
        
        if(root.data == elem){
            printAtDepthK(root,k);
            return 0;
        }
        
        int ld = print(root.left,k,elem);
        
        int rd;
        if(ld == -1){
            rd = print(root.right,k,elem);
            if(rd == -1){
                return -1;
            }else if(rd + 1 == k){
                System.out.println(root.data+" ");
                return k;
            }else{
                printAtDepthK(root.left,k-rd-2);
                return rd+1;
            }
        }else if(ld + 1 == k){
            System.out.println(root.data+" ");
            return k;
        }else{
            printAtDepthK(root.right,k-ld-2);
            return ld+1;
        }
        
    }
    
    public static void printAtDepthK(BinaryTreeNode<Integer> root,int depth){
        if(root == null){
            return;
        }
        
        if(depth == 0 && root != null){
            System.out.println(root.data+" ");
            return;
        }
        
        printAtDepthK(root.left,depth-1);
        printAtDepthK(root.right,depth-1);
    }


    public static void main(String[] args) {
        
        // BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
        //insertDuplicateNode(root);
        //BinaryTreeUse.printLevelWise(root);
        //Pair<Integer, Integer> output = getMinAndMax(root);
        //System.out.println(output.minimum + " " + output.maximum);
        //printLevelWise(root);
        
        // rootToLeafPathsSumToK(root, 13);
        // printLevelWise(root);
        // printTreeDetailed(root);
        // nodesAtDistanceK(root, 3, 3);

        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
        nodesAtDistanceK(root, 3, 3);




    }




}
