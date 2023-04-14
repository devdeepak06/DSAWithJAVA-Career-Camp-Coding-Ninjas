package Queues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> input) {
        if (input.size() <= 1) {
            return;
        }
        int front = input.poll();
        reverseQueue(input);
        input.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> input = new LinkedList<Integer>();
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t-- > 0) {
            int size = s.nextInt();
            for (int i = 0; i < size; i++) {
                input.add(s.nextInt());
            }
            reverseQueue(input);
            while (!input.isEmpty()) {
                System.out.print(input.poll() + " ");
            }
        }
    }   

}   
}
