package BinaryTrees;

import java.util.LinkedList;

class QueueEmptyException extends Exception {
}

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}

class Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public Queue() {
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

    public T add(T element) {
        Node<T> newNode = new Node<T>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return element;
    }

    public T poll() {
        if (size == 0) {
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

    public T dequeue() throws QueueEmptyException {
        if (size == 0) {
            // Throw an exception
            throw new QueueEmptyException();
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

public class LevelWiseTraversal {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        LinkedList<BinaryTreeNode<Integer>> nodesToPrint = new LinkedList<BinaryTreeNode<Integer>>();
        nodesToPrint.add(root);
        nodesToPrint.add(null);
        while (!nodesToPrint.isEmpty()) {
            BinaryTreeNode<Integer> front = nodesToPrint.poll();
            if (front == null) {
                if (nodesToPrint.isEmpty())
                    break;
                else {
                    System.out.println();
                    nodesToPrint.add(null);
                }

            } else {
                System.out.print(front.data + " ");
                if (front.left != null)
                    nodesToPrint.add(front.left);
                if (front.right != null)
                    nodesToPrint.add(front.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
        printLevelWise(root);
    }
}
