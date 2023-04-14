package Stacks;

import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}

class Stack<T>{
    private Node<T> head;
    private int size;

    public Stack() {
        head = null;
        size = 0;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public T pop(){
        if (size == 0) {
            // Throw an exception
            return null;
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
    
    public T top(){
        if (size == 0) {
            // Throw an exception
            return null;
        }
        return head.data;
    }

    public T peek() {
        return top();
    }
    
}
public class MinimumBracketReversal {
    public static int countBracketReversals(String input) {
        // Your code goes here
        if (input.length() % 2 != 0) {
            return -1;
        }
        Stack<Character> stack = new Stack<Character>();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (stack.peek() == '}') {
                    stack.push(c);
                } else if (stack.peek() == '{') {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            char c1 = stack.pop();
            char c2 = stack.pop();

            if (c1 == c2) {
                count = count + 1;
            } else {
                count = count + 2;
            }
        }
        return count;

    }

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.next();
        System.out.println(countBracketReversals(input));
    }

}
