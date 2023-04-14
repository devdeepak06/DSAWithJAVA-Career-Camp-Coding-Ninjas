//You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
//Note:
//Given array/list can contain duplicate elements.
//The order of the triplet(s) is not important. So, in a pair where 5 is present in 6th and 7th position, both will be considered.
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//First line of each test case or query contains an integer 'N' representing the size of the first array/list.
//Second line contains 'N' single space separated integers representing the elements in the array/list.
//Third line contains an integer 'X'.
//Output format :
//For each test case, print the total number of triplets present in the array/list.
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//0 <= X <= 10^9
//Time Limit: 1 sec
//Sample Input 1:
//1
//7
//1 2 3 4 5 6 7
//12
//Sample Output 1:
//5
package JavaFundamentals;

import java.util.Scanner;

public class TripletSum {
    public static int tripletSum(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
                int n = s.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }
                int x = s.nextInt();
                System.out.println(tripletSum(arr, x));
                t--;
            }
        }
    }
}