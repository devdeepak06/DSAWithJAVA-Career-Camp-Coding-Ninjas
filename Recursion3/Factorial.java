public class Factorial {
    public static void factorial(int input, int ans){
        if(input == 0){
            System.out.println(ans);
            return;
        }
        // Recursive Case
        ans = ans * input; // ans is the factorial of input - 1
        factorial(input - 1, ans);
    }
    public static void main(String[] args) {
        int n = 5;
        factorial(n, 1);

    }
}
