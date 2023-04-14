package JavaFundamentals;

import java.util.Scanner;
import java.lang.Math;
public class TotalSalary {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int basic = s.nextInt();
            char grade = s.next().charAt(0);
            double hra = 0.20 * basic;
            double da = 0.50 * basic;
            int allow;
            if (grade == 'A') {
                allow = 1700;
            } else if (grade == 'B') {
                allow = 1500;
            } else {
                allow = 1300;
            }
            int pf = (int)(0.11 * basic);
            double totalSalary = (double)(basic + hra + da + allow - pf);
            double ps = Math.round(totalSalary);
            int total = (int)(ps);
            System.out.println(total);
        }
    }
}