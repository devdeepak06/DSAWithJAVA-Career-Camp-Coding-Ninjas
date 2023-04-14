package Queues;

public class QueueUse {

    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        QueueUsingArray queue = new QueueUsingArray();
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            queue.enqueue(arr[i]);
        }
        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {
                // Never reach here
            }
        }
        System.out.println("");
    }    
}
