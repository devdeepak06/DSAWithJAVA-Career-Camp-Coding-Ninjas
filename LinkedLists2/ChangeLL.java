//Given a linked list that contain some random integers from 1 to n with many duplicates. You need to replace each duplicate element that is present in the linked list with the values n+1, n+2, and so on (starting from left to right in given LL).
//For eg. if input linked list is
//1 3 1 4 4 2 1 -1
//updated linked list should be -
//1 3 5 4 6 2 7
//n in the list is 4, so I have to replace each duplicate from left to right with 4, 5 and so on. In that way, element 1 (which is at index 2) will be replaced by 5, element 4 (which is present at index 4) by 6 and element 1 (which is present at index 6) by 7.
//You don't need to print the elements, just update the elements in LL.
//Input format :
//Line 1 : Linked list elements (separated by space and terminated by -1)
//Output format :
//Updated LL elements (separated by space)
//Constraints :
//1 <= n <= 10^6
//Sample Input 1 :
//1 3 1 4 4 2 1 -1
//Sample Output 1 :
//1 3 5 4 6 2 7

// Path: LinkedLists2\ReplaceDuplicateValues.java

package LinkedLists2;

import java.util.Scanner;

// class LinkedListNode<T> {
//     T data;
//     LinkedListNode<T> next;
//     public LinkedListNode(T data) {
//         this.data = data;
//     }
// }

public class ChangeLL{
    public static void change(LinkedListNode<Integer> head){
        
        LinkedListNode<Integer> temp=head;

        while(temp!=null && temp.next!=null){
            LinkedListNode<Integer> temp1=temp.next;
            while(temp1!=null){
                if(temp.data==temp1.data && temp1.data!=0 && temp.data !=0)
                {
                temp1.data=temp1.data+1;
                }
                temp1=temp1.next;
            }
            temp=temp.next;
        }
    }
    public static LinkedListNode<Integer> takeInput(){
        try (Scanner s = new Scanner(System.in)) {
            int n=s.nextInt();
            LinkedListNode<Integer> head=new LinkedListNode<Integer>(s.nextInt());
            LinkedListNode<Integer> temp=head;
            for(int i=1;i<n;i++){
                LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(s.nextInt());
                temp.next=newNode;
                temp=newNode;
            }
            return head;
        }
    }
    //print
    public static void print(LinkedListNode<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        LinkedListNode<Integer> head=takeInput();
        change(head);
        print(head);
    }

}