package JavaFundamentals;
import java.util.Scanner;
public class F2C {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int start = s.nextInt();
            int end = s.nextInt();
            int step = s.nextInt();
            int f = start;
            while(f<=end)
            {
                int c = (int)((5.0/9)*(f-32));
                System.out.println(f+"\t"+c);
                f=f+step;
            }
        }
    }
}
