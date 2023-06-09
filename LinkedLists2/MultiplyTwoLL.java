package LinkedLists2;

import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class MultiplyTwoLL {

    public static LinkedListNode<Integer> temphead;

    public static int reverse(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = head;
        int len = 0;
        LinkedListNode<Integer> ahead = null;
        while (curr != null) {
            len++;
            ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }

        head = prev;
        temphead = head;
        return len;
    }

    public static LinkedListNode<Integer> makeEmptyList(int length) {
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> traverse = null;

        while (length > 0) {

            LinkedListNode<Integer> temp = new LinkedListNode<Integer>(0);

            if (head == null) {
                head = temp;
                traverse = temp;
            } else {
                traverse.next = temp;
                traverse = traverse.next;

            }
            length--;
        }

        return head;
    }

    public static LinkedListNode<Integer> multiplyLL(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {

        // Reverse the input lists and get their lengths
        int m = reverse(head1);
        head1 = temphead;
        int n = reverse(head2);
        head2 = temphead;

        // Make a list that will contain the result of multiplication, m+n+1 can be max
        // size of the list
        LinkedListNode<Integer> result = makeEmptyList(m + n);

        // Pointers for traversing the linked lists
        LinkedListNode<Integer> secondPtr = head2, resultPtr1 = result, resultPtr2, firstPtr;

        // multiply each Node of second list with first
        while (secondPtr != null) {
            int carry = 0;

            // Each time we start from the next of Node from which we started last time
            resultPtr2 = resultPtr1;

            firstPtr = head1;

            while (firstPtr != null) {

                // Multiply first list's digit with current second list's digit
                int mul = firstPtr.data * secondPtr.data + carry;

                // Assign the product to corresponding Node of result
                resultPtr2.data += mul % 10;

                // Resultant Node itself can have more than 1 digit
                carry = mul / 10 + resultPtr2.data / 10;
                resultPtr2.data = resultPtr2.data % 10;

                firstPtr = firstPtr.next;
                resultPtr2 = resultPtr2.next;
            }

            // If carry is remaining from last multiplication
            if (carry > 0) {
                resultPtr2.data += carry;
            }

            resultPtr1 = resultPtr1.next;
            secondPtr = secondPtr.next;

        }

        // reverse the result list
        reverse(result);
        result = temphead;

        // Remove if there are zeros at starting
        while (result.next != null && result.data == 0) {
            result = result.next;

        }

        // Return head of multiplication list
        return result;

    }

    public static void multiply(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        LinkedListNode<Integer> print = multiplyLL(head1, head2);
        while (print != null) {
            System.out.print(print.data + " ");
            print = print.next;
        }
    }

    public static LinkedListNode<Integer> takeInput() {
        try (Scanner s = new Scanner(System.in)) {
            int data = s.nextInt();
            LinkedListNode<Integer> head = null;
            LinkedListNode<Integer> tail = null;
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

    public static void main(String[] args) {
        LinkedListNode<Integer> head1 = takeInput();
        LinkedListNode<Integer> head2 = takeInput();
        multiply(head1, head2);
    }

}
