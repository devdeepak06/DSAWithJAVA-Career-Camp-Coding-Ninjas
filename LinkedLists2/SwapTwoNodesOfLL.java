package LinkedLists2;

import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class SwapTwoNodesOfLL {

    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
        // Your code goes here
        if (i == j) {
            return head;
        }
        LinkedListNode<Integer> node = head, prevNode = null, prevNode2 = null;
        int count = 0;
        while (node != null) {
            if (count == i) {
                break;
            }
            prevNode = node;
            node = node.next;
            count++;
        }
        LinkedListNode<Integer> node2 = head;
        count = 0;
        while (node2 != null) {
            if (count == j) {
                break;
            }
            prevNode2 = node2;
            node2 = node2.next;
            count++;
        }
        if (prevNode == null) {
            head = node2;
        } else {
            prevNode.next = node2;
        }
        if (prevNode2 == null) {
            head = node;
        } else {
            prevNode2.next = node;
        }
        LinkedListNode<Integer> temp = node.next;
        node.next = node2.next;
        node2.next = temp;
        return head;
    }

    public static LinkedListNode<Integer> takeInput() {
        try (Scanner s = new Scanner(System.in)) {
            // System.out.println("Enter the data: ");
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
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            LinkedListNode<Integer> head = takeInput();
            // System.out.println("Enter the value of i: ");
            // int i = s.nextInt();
            // System.out.println("Enter the value of j: ");
            // int j = s.nextInt();
            head = swapNodes(head, 2, 3);
            print(head);
        }
    }

}