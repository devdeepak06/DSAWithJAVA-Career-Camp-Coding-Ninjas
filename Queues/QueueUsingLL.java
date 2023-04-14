package Queues;

// class Node<T> {
//     T data;
//     Node<T> next;

//     Node(T data) {
//         this.data = data;
//         next = null;
//     }
// }

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class QueueUsingLL {
    private Node front;
    private Node rear;
    private int size;

    public QueueUsingLL() {
        front = null;
        rear = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int front() {
        
        if (size == 0) {
            // Throw an exception
            // QueueEmptyException e = new QueueEmptyException();
            // throw e;
            // throw new QueueEmptyException();
            return -1;
        }
        return front.data;
    }

    public void enqueue(int element)  {
        Node newNode = new Node(element);
        if (size == 0) {
            front = newNode;
            rear = newNode;
            size++;
        } else {
            rear.next = newNode;
            rear = newNode;
            size++;
        }
    }


    public int dequeue(){
        if (size == 0) {
            // Throw an exception
            // QueueEmptyException e = new QueueEmptyException();
            // throw e;
            // throw new QueueEmptyException();
            return -1;

        }
        int temp = front.data;
        front = front.next;
        size--;
        if (size == 0) {
            front = null;
            rear = null;
        }
        return temp;
    }
}
