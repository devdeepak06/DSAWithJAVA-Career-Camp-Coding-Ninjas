package Queues;


public class QueueUsingArray {
    private int[] data;
    private int front; // index of the element at the front of the queue
    private int rear; // index of the element at the rear of the queue
    private int size; // number of elements present in the queue

    public QueueUsingArray() {
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int front() throws QueueEmptyException {
        if (size == 0) {
            // Throw an exception
            // QueueEmptyException e = new QueueEmptyException();
            // throw e;
            throw new QueueEmptyException();
        }

        return data[front];
    }
    //double capacity
    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index] = temp[i];
            index++;
        }
        for (int i = 0; i <= rear; i++) {
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length - 1;
    }
    public void enqueue(int element) {
        if (size == data.length) {
            // Throw an exception
            // QueueFullException e = new QueueFullException();
            // throw e;
            // throw new QueueFullException();
            doubleCapacity();
            

        }
        if (size == 0) {
            front = 0;
        }
        rear = (rear + 1) % data.length;
        // rear++; 
        // //Circular Queue
        // if (rear == data.length) { 
        //     rear = 0;
        // }
        data[rear] = element;
        size++;

    }

    // public void enqueue(int element) throws QueueFullException {
    //     if (size == data.length) {
    //         // Throw an exception
    //         // QueueFullException e = new QueueFullException();
    //         // throw e;
    //         throw new QueueFullException();
    //     }
    //     if (size == 0) {
    //         front = 0;
    //     }
    //     rear = (rear + 1) % data.length;
    //     // rear++; 
    //     // //Circular Queue
    //     // if (rear == data.length) { 
    //     //     rear = 0;
    //     // }
    //     data[rear] = element;
    //     size++;

    // }

    public int dequeue() throws QueueEmptyException {
        if (size == 0) {
            // Throw an exception
            // QueueEmptyException e = new QueueEmptyException();
            // throw e;
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front = (front + 1) % data.length;
        // front++;
        // //Circular Queue
        // if (front == data.length) { 
        //     front = 0;
        // }

        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }



    
}
