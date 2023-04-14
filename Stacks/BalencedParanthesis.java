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
    
    public T top(){
        if (size == 0) {
            // Throw an exception
            return null;
        }
        return head.data;
    }
    
}



public class BalencedParanthesis {
    /**
     * @param expression
     * @return
     * @throws StackEmptyException
     */
    public static boolean isBalanced(String expression){
        //Your code goes here
        
        StackUsingLinked<Character> stack = new StackUsingLinked<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == '}' && top != '{') {
                    return false;
                } else if (ch == ']' && top != '[') {
                    return false;
                } else if (ch == ')' && top != '(') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            String expression = s.nextLine();
            System.out.println(isBalanced(expression));
        }
    }
    
}
