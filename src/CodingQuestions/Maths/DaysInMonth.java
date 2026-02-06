package CodingQuestions.Maths;

import java.util.Scanner;

public class DaysInMonth {
    static void main() {
        Scanner in = new Scanner(System.in);
//        String date = in.nextLine();
//        String[] parts = date.split("-");
//
//        int month = Integer.parseInt(parts[1]);
//        int year = Integer.parseInt(parts[2]);
//
//        YearMonth ym = YearMonth.of(year, month);
//        int days = ym.lengthOfMonth();
//
//        System.out.println(days);
        int[] arr = {31,28,31,30,31,30,31,31,30,31,30,31};
        String date = in.nextLine();
        String[] parts = date.split("-");

        int month = Integer.parseInt(parts[1]);

        System.out.println(arr[month-1]);


    }
}

