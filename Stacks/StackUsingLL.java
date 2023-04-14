package Stacks;

class Node<T> {
    T data;
    Node<T> next;
    public Node(T data) {
        this.data = data;
        next = null;
    }
}

public class StackUsingLL<T> {
    private Node<T> head;
    public StackUsingLL(int size) {
        this.size = size;
    }
    private int size;
    public StackUsingLL() {
        head = null;
        size = 0;
    }
    public int getSize() {
        return size;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public T top() throws StackEmptyException {
        if (size == 0) {
            // Stack is empty
            // StackEmptyException e = new StackEmptyException();
            // throw e;
            throw new StackEmptyException();
        }
        return head.data;
    }
    public void push(T element) {
        Node<T> newNode = new Node<T>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public T pop() throws StackEmptyException {
        if (size == 0) {
            throw new StackEmptyException();
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }


}
