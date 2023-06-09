package Test6;


class Node <T> {
    T data;
    Node<T> next;
    public Node(T data) {
        this.data = data;
        next = null;
    }
}
public class MoveToLast {
    public static Node<Integer> func(Node<Integer> head,int n) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if (head==null || head.next==null) return head;
        Node<Integer> prev = null,curr= head,tail = head;
        while (tail.next!=null) {
            tail=tail.next;
        }
        Node<Integer> oldTail = tail;
        while (curr.next!=oldTail){
            if (curr.data==n){
                tail.next= new Node<>(n);
                tail= tail.next;
                if (prev==null){
                    curr = curr.next;
                    head = curr;
                }else {
                    prev.next = prev.next.next;
                    curr = prev.next;
                }
            }else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;

    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
