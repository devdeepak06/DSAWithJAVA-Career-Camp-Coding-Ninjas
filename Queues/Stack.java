package Queues;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class Stack {
    private Node top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (size == 0) {
            // Throw an exception
            // StackEmptyException e = new StackEmptyException();
            // throw e;
            // throw new StackEmptyException();
            return -1;
        }
        int temp = top.data;
        top = top.next;
        size--;
        return temp;
    }

    public int top() {
        if (size == 0) {
            // Throw an exception
            // StackEmptyException e = new StackEmptyException();
            // throw e;
            // throw new StackEmptyException();
            return -1;
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        for (int i = 1; i <= 5; i++) {
            s.push(i);
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }


}
