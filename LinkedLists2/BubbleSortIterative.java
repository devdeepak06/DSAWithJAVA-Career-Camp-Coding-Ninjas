package LinkedLists2;
import java.util.Scanner;
public class BubbleSortIterative {
    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> next = null;
        while (curr != null) {
            next = curr.next;
            while (next != null) {
                if (curr.data > next.data) {
                    int temp = curr.data;
                    curr.data = next.data;
                    next.data = temp;
                }
                next = next.next;
            }
            curr = curr.next;
        }
        return head;
    }
    public static LinkedListNode<Integer> takeInput() {
        try (Scanner s = new Scanner(System.in)) {
            int data = s.nextInt();
            LinkedListNode<Integer> head = null, tail = null;
            while (data != -1) {
                LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
                data = s.nextInt();
            }
            return head;
        }
    }
    public static void print(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            LinkedListNode<Integer> head = takeInput();
            head = bubbleSort(head);
            print(head);
        }
    }
}
