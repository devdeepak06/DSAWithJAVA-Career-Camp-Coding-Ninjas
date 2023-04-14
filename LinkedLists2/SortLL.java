package LinkedLists2;

import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class SortLL {
    public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head){
        LinkedListNode<Integer> temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int arr[]=new int[count];
        int i=0;
        while(head!=null){
            arr[i]=head.data;
            i++;
            head=head.next;
        }
        for(int j=0;j<arr.length;j++){
            for(int k=j+1;k<arr.length;k++){
                if(arr[j]>arr[k]){
                    int temp1=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp1;
                }
            }
        }
        LinkedListNode<Integer> head1=new LinkedListNode<Integer>(arr[0]);
        LinkedListNode<Integer> temp1=head1;
        for(int j=1;j<arr.length;j++){
            LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(arr[j]);
            temp1.next=newNode;
            temp1=newNode;
        }
        return head1;
    }
    // public static LinkedListNode<Integer> takeInput(){
    //     Scanner s=new Scanner(System.in);
    //     int n=s.nextInt();
    //     LinkedListNode<Integer> head=new LinkedListNode<Integer>(s.nextInt());
    //     LinkedListNode<Integer> temp=head;
    //     for(int i=1;i<n;i++){
    //         LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(s.nextInt());
    //         temp.next=newNode;
    //         temp=newNode;
    //     }
    //     return head;
    // }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n=s.nextInt();
            LinkedListNode<Integer> head=new LinkedListNode<Integer>(s.nextInt());
            LinkedListNode<Integer> temp=head;
            for(int i=1;i<n;i++){
                LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(s.nextInt());
                temp.next=newNode;
                temp=newNode;
            }
            LinkedListNode<Integer> head1=sort(head);
            while(head1!=null){
                System.out.print(head1.data+" ");
                head1=head1.next;
            }
        }
    }
    
}
