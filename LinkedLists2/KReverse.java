package LinkedLists2;
import java.util.Scanner;
public class KReverse {
    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> next = null;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            head.next = kReverse(next, k);
        }
        return prev;
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
            // int k = s.nextInt();
            head = kReverse(head, 4);
            print(head);
        }
    }
    
}
