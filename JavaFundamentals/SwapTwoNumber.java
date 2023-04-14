
// You are given two numbers. You need to swap them without using a temporary variable.

package JavaFundamentals;

import java.util.Scanner;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class SwapTwoNumber {
    public static Pair<Integer, Integer> swap(Pair<Integer, Integer> swapValues) {
        // Write your code here.
        int temp = swapValues.getKey();
        swapValues = new Pair<>(swapValues.getValue(), temp);
        return swapValues;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            while (testCases-- > 0) {
                int firstValue = scanner.nextInt();
                int secondValue = scanner.nextInt();
                Pair<Integer, Integer> swapValues = new Pair<>(firstValue, secondValue);
                Pair<Integer, Integer> swappedValues = swap(swapValues);
                System.out.println(swappedValues.getKey() + " " + swappedValues.getValue());
            }
        }
    }

}
