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
    
}


public class ReverseStack {

    // public static void reverseStack(Stack<Integer> input, Stack<Integer> empty) {

        public static void reverseStack( Stack<Integer> input,Stack<Integer> empty ) {
		
            if(input.isEmpty()) {
                return ;
            }
            int temp = input.pop();
            reverseStack(input, empty);
            while(!input.isEmpty() ) {
                empty.push(input.pop());
            }
            input.push(temp);
            while(!empty.isEmpty()) {
                input.push(empty.pop());
            }
            
            
        }
		//Your code goes here
    //     if (input.size()==0 || input.size()==1)
    //     {
    //         return;
    //     }
        
    //     int top=input.pop();
    //     reverseStack(input,empty);
        
    //     while(!input.isEmpty())
    //     {
    //         empty.push(input.pop());
    //     }
    //     input.push(top);
        
    //     while(!empty.isEmpty())
    //     {
    //         input.push(empty.pop());
    //     }
	// }
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            Stack<Integer> input = new Stack<Integer>();
            Stack<Integer> emptyStack = new Stack<Integer>();
            int size = s.nextInt();
            for(int i = 0; i < size; i++) {
                input.push(s.nextInt());
            }
            reverseStack(input, emptyStack);
            while(!input.isEmpty()) {
                System.out.print(input.pop() + " ");
            }
        }


    }


}