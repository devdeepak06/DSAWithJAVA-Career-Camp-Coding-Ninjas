package Queues;
// import java.Queue;
class Queue{
    private int data;
    private Queue next;
    public Queue(int data) {
        this.data = data;
        this.next = null;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Queue getNext() {
        return next;
    }
    public void setNext(Queue next) {
        this.next = next;
    }
    public void enqueue(int element) {
    }
    public int dequeue() {
        return 0;
    }
    public int getSize() {
        return 0;
    }
}

public class StackUsing2Queues {
    private QueueUsingLL q1;
    private QueueUsingLL q2;

    // private QueueUsingLL q1;
    // private QueueUsingLL q2;
    private int size;

    public StackUsing2Queues() {
        q1 = null;
        q2 = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        q1.enqueue(element);
        size++;
    }

    public int pop() {
        if (size == 0) {
            // StackEmptyException e = new StackEmptyException();
            // throw e;
            // throw new StackEmptyException();
            return -1;
        }
        while (q1.getSize() > 1) {
            q2.enqueue(q1.dequeue());
        }
        int temp = q1.dequeue();
        QueueUsingLL tempQ = q1;
        q1 = q2;
        q2 = tempQ;
        size--;
        return temp;
    }

    public int top()  {
        if (size == 0) {
            // StackEmptyException e = new StackEmptyException();
            // throw e;
            // throw new StackEmptyException();
            return -1;
        }
        while (q1.getSize() > 1) {
            q2.enqueue(q1.dequeue());
        }
        int temp = q1.dequeue();
        q2.enqueue(temp);
        QueueUsingLL tempQ = q1;
        q1 = q2;
        q2 = tempQ;
        return temp;
    }
}
