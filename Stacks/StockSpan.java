package Stacks;

import java.util.Scanner;

public class StockSpan {
    public static void main(String[] args) {
        try (
        Scanner s = new Scanner(System.in)) {
            int[] price = new int[s.nextInt()];
            int[] span = stockSpan(price);
            for (int i = 0; i < span.length; i++) {
                System.out.print(span[i] + " ");
            }
        }
    }
    public static int[] stockSpan(int[] price) {
        int[] span = new int[price.length];
        span[0] = 1;
        for (int i = 1; i < price.length; i++) {
            int count = 1;
            for (int j = i - 1; j >= 0 && price[j] < price[i]; j--) {
                count++;
            }
            span[i] = count;
        }
        return span;
    }
    
}
