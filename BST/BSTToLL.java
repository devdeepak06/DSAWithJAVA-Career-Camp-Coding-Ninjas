// Binary Tree Node class
class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}

// LinkedList Node Class

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class BSTToLL {

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        LinkedListNode<Integer> leftLL = constructLinkedList(root.left);
        LinkedListNode<Integer> rightLL = constructLinkedList(root.right);
        LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(root.data);
        if (leftLL == null && rightLL == null) {
            return newNode;
        } else if (leftLL == null) {
            newNode.next = rightLL;
            return newNode;
        } else if (rightLL == null) {
            LinkedListNode<Integer> temp = leftLL;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return leftLL;
        } else {
            LinkedListNode<Integer> temp = leftLL;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = rightLL;
            return leftLL;
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
        LinkedListNode<Integer> head = constructLinkedList(root);

        System.out.println("Linked List is: " + head.data);



    }
}
