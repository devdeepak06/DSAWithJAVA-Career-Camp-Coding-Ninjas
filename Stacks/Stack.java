package Stacks;

public class Stack {

    // Define the data members

    private int[] data;
    private int topIndex;

    public Stack() {

        data = new int[10];
        topIndex = -1;
    }

    /*----------------- Public Functions of Stack -----------------*/

    public int getSize() {
        return topIndex + 1;
    }

    public boolean isEmpty() {
        return (topIndex == -1);
    }

    public void push(int element) {
        //Implement the push(element) function
         if (getSize() == data.length) {
            int[] temp = data;
            data = new int[2 * temp.length];
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }

        }
        topIndex++;
        data[topIndex] = element;

    }

    public int top(){
        //Implement the top() function
        if(topIndex == -1) {
            return -1;
        }
        return data[topIndex];
    }

    public int pop() {
        // Implement the pop() function
        if (topIndex == -1) {
            return -1;
        }
        int temp = top();
        topIndex--;
        return temp;
    }
}