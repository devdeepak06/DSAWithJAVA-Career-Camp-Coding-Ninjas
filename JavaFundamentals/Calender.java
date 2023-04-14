package JavaFundamentals;
import java.util.Calendar;
import java.util.Scanner;

//You are given a date. You just need to write the method, getDay, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
//
//For example, if you are given the date August 14th 2017, the method should return MONDAY as the day on that date.
//
//Input Format
//
//A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.
//
//Constraints
//
//2000 < year < 3000
//
//Output Format
//
//Output the correct day in capital letters.
//
//Sample Input
//
//08 05 2015
//
//Sample Output
//
//WEDNESDAY
//

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String dayName = "";
        switch (dayOfWeek) {
            case 1:
                dayName = "SUNDAY";
                break;
            case 2:
                dayName = "MONDAY";
                break;
            case 3:
                dayName = "TUESDAY";
                break;
            case 4:
                dayName = "WEDNESDAY";
                break;
            case 5:
                dayName = "THURSDAY";
                break;
            case 6:
                dayName = "FRIDAY";
                break;
            case 7:
                dayName = "SATURDAY";
                break;
        }
        return dayName;
    }



}


public class Calender {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int month = in.nextInt();
            int day = in.nextInt();
            int year = in.nextInt();
            String res = Result.findDay(month, day, year);
            System.out.println(res);
        }
    }
}
