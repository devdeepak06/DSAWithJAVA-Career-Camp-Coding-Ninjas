//Reverse the First K Elements in the Queue
//For a given queue containing all integer data, reverse the first K elements.
//You have been required to make the desired change in the input queue itself.
//Input Format:
//The first line of input would contain two integers N and K, separated by a single space. They denote the total number of elements in the queue and the count with which the elements need to be reversed respectively.
//The second line of input contains N integers separated by a single space, representing the order in which the elements are enqueued into the queue.
//Output Format:
//The only line of output prints the updated order in which the elements are dequeued from the queue, all of them separated by a single space.
//Note:
//You are not required to print the expected output explicitly, it has already been taken care of. Just make the changes in the input queue itself.
//Constraints:
//1 <= N <= 10^6
//1 <= K <= N
//-2^31 <= data <= 2^31 - 1
//Time Limit: 1 second
//Sample Input 1:
//5 3
//1 2 3 4 5
//Sample Output 1:
//3 2 1 4 5
//Sample Input 2:
//7 7
//3 4 2 5 6 7 8
//Sample Output 2:
//8 7 6 5 2 4 3

package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseKElement {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        if (input.size()>k)
        {
            k=k%input.size();
        }
        if (k==0 || k==1)
        {
            return input;
        }
        
        reverseQueue(input,k);
        
        for (int i=0;i<input.size()-k;i++)
        {
            input.add(input.remove());
        }
        return input;
    }

    public static void reverseQueue(Queue<Integer> input,int k)
    {
        if (k==0 || k==1)
        {
            return;
        }
        int front=input.remove();
        reverseQueue(input,k-1);
        input.add(front);
    }

    public static void main(String[] args) {

        Queue<Integer> input = new LinkedList<Integer>();
        try (Scanner s = new Scanner(System.in)) {
                int size = s.nextInt();
                int k = s.nextInt();
                for (int i = 0; i < size; i++) {
                    input.add(s.nextInt());
                }
                input = reverseKElements(input, k);
                while (!input.isEmpty()) {
                    System.out.print(input.remove() + " ");
                }
        }
    }
}


// package Queues;

// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;

// public class ReverseKElement {
//     public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
//         if (input.size() <= 1 || k <= 0) {
//             return input;
//         }
//         if (k > input.size()) {
//             k = input.size();
//         }
//         Queue<Integer> temp = new LinkedList<Integer>();
//         for (int i = 0; i < k; i++) {
//             temp.add(input.poll());
//         }
//         while (!temp.isEmpty()) {
//             input.add(temp.poll());
//         }
//         for (int i = 0; i < input.size() - k; i++) {
//             input.add(input.poll());
//         }
//         return input;
//     }

//     public static void main(String[] args) {
//         Queue<Integer> input = new LinkedList<Integer>();
//         try (Scanner s = new Scanner(System.in)) {
//             int size = s.nextInt();
//             int k = s.nextInt();
//             for (int i = 0; i < size; i++) {
//                 input.add(s.nextInt());
//             }
//             Queue<Integer> ans = reverseKElements(input, k);
//             while (!ans.isEmpty()) {
//                 System.out.print(ans.poll() + " ");
//             }
//         }
//     }
// }
