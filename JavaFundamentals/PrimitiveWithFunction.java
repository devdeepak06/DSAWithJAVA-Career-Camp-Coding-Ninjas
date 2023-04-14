package JavaFundamentals;

public class PrimitiveWithFunction {
    public static void increment(int i) {
        i++;
    }

    public static void main(String[] args) {
        int i = 10;
        increment(i);
        System.out.println(i);
    }
}
