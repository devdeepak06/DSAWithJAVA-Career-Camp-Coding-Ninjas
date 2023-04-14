package Queues;

import java.util.Scanner;

public class QueueLL {
    public static void main(String[] args) throws QueueEmptyException  {
        QueueUsingLL queue = new QueueUsingLL();
        try (Scanner s = new Scanner(System.in)) {
            int query = s.nextInt();
            while (query-- > 0) {
                int choice, input;
                choice = s.nextInt();
                switch (choice) {
                    case 1:
                        input = s.nextInt();
                        // dont need to return anything
                        queue.enqueue(input);
                        break;
                    case 2:
                        System.out.println(queue.dequeue());
                        break;
                    case 3:
                        System.out.println(queue.front());
                        break;
                    case 4:
                        // prints the current size of the queue
                        System.out.println(queue.getSize());
                        break;
                    case 5:
                        // prints 'true' or 'false'(without quotes).
                        // true if queue is empty, else false
                        System.out.println(queue.isEmpty());
                        break;
                    default:
                        break;

                }
            }
        }
    }

}
