package Stacks;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        // StackUsingArray stack = new StackUsingArray();
        // stack.data[1] = 10;
    //     stack.push(10);
    //     stack.push(20);
    //     stack.push(30);
    //     stack.push(40);
    //     stack.push(50);
    //     stack.push(60);
        
    //    System.out.println(stack.top());
    StackUsingLL<Integer> stack = new StackUsingLL<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
    stack.push(50);
    stack.push(60);
    System.out.println(stack.top());
    System.out.println(stack.pop());



    }
    
}
