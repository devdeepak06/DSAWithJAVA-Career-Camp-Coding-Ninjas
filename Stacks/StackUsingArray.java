package Stacks;

public class StackUsingArray {
    private int[] data;
    private int topIndex;
    public StackUsingArray() {
        data = new int[10];
        topIndex = -1;
    }
    public int size() {
        return topIndex + 1;
    }
    public boolean isEmpty() {
        // if (topIndex == -1) {
        //     return true;
        // } else {
        //     return false;
        // }
        return (topIndex == -1);
    }
    public int top() throws StackEmptyException {
        if (size() == 0) {
            // Stack is empty
            // StackEmptyException e = new StackEmptyException();
            // throw e;
            throw new StackEmptyException();
        }
        return data[topIndex];
    }
    public void push(int element) throws StackFullException {
        if (size() == data.length) {
            // Stack is full
            // StackFullException e = new StackFullException();
            // throw e;
            throw new StackFullException();
        }
        // topIndex++;
        data[++topIndex] = element;
    }
    public int pop() throws StackEmptyException {
        if(topIndex == -1) {
            throw new StackEmptyException();
        }
        int temp = top();
        topIndex--;
        return temp;
    }

}
