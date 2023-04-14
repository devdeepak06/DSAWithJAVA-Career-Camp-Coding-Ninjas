package LinkedLists2;

import java.util.Scanner;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
public class NextNumber {
    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head){
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
        int j=arr.length-1;

        while(j>=0){
            if(arr[j]==9){
                arr[j]=0;
                j--;
            }
            else{
                arr[j]=arr[j]+1;
                break;
            }
        }
        if(j==-1){
            int arr1[]=new int[arr.length+1];
            arr1[0]=1;
            for(int k=1;k<arr1.length;k++){
                arr1[k]=arr[k-1];
            }
            LinkedListNode<Integer> head1=new LinkedListNode<Integer>(arr1[0]);
            LinkedListNode<Integer> temp1=head1;
            for(int k=1;k<arr1.length;k++){
                LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(arr1[k]);
                temp1.next=newNode;
                temp1=newNode;
            }
            return head1;
        }
        else{
            LinkedListNode<Integer> head1=new LinkedListNode<Integer>(arr[0]);
            LinkedListNode<Integer> temp1=head1;
            for(int k=1;k<arr.length;k++){
                LinkedListNode<Integer> newNode=new LinkedListNode<Integer>(arr[k]);
                temp1.next=newNode;
                temp1=newNode;
            }
            return head1;
        }


    }
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
        LinkedListNode<Integer> head1=nextLargeNumber(head);
        while(head1!=null){
            System.out.print(head1.data+" ");
            head1=head1.next;

        }
    }

}

}
