package JavaFundamentals;
import java.util.Scanner;
public class TotalPrime {
    public int totalPrime(int s, int e) {
        int count = 0;
        for(int i = s; i <= e; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
		
		TotalPrime obj = new TotalPrime();
		try (Scanner sc = new Scanner(System.in)) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            System.out.println(obj.totalPrime(s, e));
        }
	}
}