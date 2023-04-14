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
class StackUsingLinked<T>{
    private Node<T> head;
    private int size;

    public StackUsingLinked() {
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
    
    public T top() {
        if (size == 0) {
            // Throw an exception
            return null;
        }
        return head.data;
    }
}

public class CheckRedundantBrackets {
    public static boolean checkRedundantBrackets(String expression){
        StackUsingLinked<Character> stack = new StackUsingLinked<>();
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (currentChar != ')') {
                stack.push(currentChar);
            } else {
                if (stack.top() == '(' || stack.size() == 1 || stack.top() == '(' || stack.size() == 2) {
                    return true;
                }
                // else if(stack.top() == '+' || stack.top() == '-' || stack.top() == '*' || stack.top() == '/') {
                //     stack.pop();
                // }
                else {
                    while (stack.top() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String expression = s.nextLine();
            System.out.println(checkRedundantBrackets(expression));
        }
    }
}
