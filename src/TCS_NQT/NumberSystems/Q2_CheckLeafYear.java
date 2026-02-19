package TCS_NQT.NumberSystems;

import java.util.Scanner;

public class Q2_CheckLeafYear {
    static boolean checkLeafYear(String s){
        String[] parts = s.split("-");
        int year = Integer.parseInt(parts[2]);

        if(year % 4 == 0){
            if(year % 100 == 0){
                return year%400==0;
            }
            return true;
        }
        return false;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter DD-MM-YYYY");
        String s = in.nextLine();
        System.out.println(checkLeafYear(s));
    }
}
