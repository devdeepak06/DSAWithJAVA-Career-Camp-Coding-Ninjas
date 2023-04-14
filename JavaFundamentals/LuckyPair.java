//A pair is called lucky if its sum is even and positive. Given three numbers find if there exists a lucky pair or not. If there are two lucky pairs, print the one with the largest sum. If there are no lucky pairs, print -1.
//Input Format
//The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains three space separated integers a, b, c.
//Output Format
//For each test case, print the largest sum of lucky pair. If there are no lucky pairs, print -1.
//Your Task
//This is a function problem. You only need to complete the function luckyPair that takes a, b, c as parameters and returns the largest sum of lucky pair. If there are no lucky pairs, return -1.
//Constraints
//1 <= T <= 100
//-100 <= a, b, c <= 100
//Example
//Input
//23 32 12
//Output
//NO
package JavaFundamentals;

import java.util.Scanner;

public class LuckyPair {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases: ");
            int t = sc.nextInt();
            while (t-- > 0) {
                System.out.println("Enter the three numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                System.out.println(luckyPair(a, b, c));
            }
        }
    }

    public static int luckyPair(int a, int b, int c) {
        int sum1 = a + b;
        int sum2 = b + c;
        int sum3 = a + c;
        if (sum1 % 2 == 0 && sum1 > 0) {
            if (sum2 % 2 == 0 && sum2 > 0) {
                if (sum3 % 2 == 0 && sum3 > 0) {
                    if (sum1 > sum2 && sum1 > sum3) {
                        return sum1;
                    } else if (sum2 > sum1 && sum2 > sum3) {
                        return sum2;
                    } else {
                        return sum3;
                    }
                } else {
                    if (sum1 > sum2) {
                        return sum1;
                    } else {
                        return sum2;
                    }
                }
            } else if (sum3 % 2 == 0 && sum3 > 0) {
                if (sum1 > sum3) {
                    return sum1;
                } else {
                    return sum3;
                }
            } else {
                return sum1;
            }
        } else if (sum2 % 2 == 0 && sum2 > 0) {
            if (sum3 % 2 == 0 && sum3 > 0) {
                if (sum2 > sum3) {
                    return sum2;
                } else {
                    return sum3;
                }
            } else {
                return sum2;
            }
        } else if (sum3 % 2 == 0 && sum3 > 0) {
            return sum3;
        } else {
            return -1;
        }
    }
}