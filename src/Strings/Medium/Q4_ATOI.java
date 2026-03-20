package Strings.Medium;

import java.util.Scanner;

public class Q4_ATOI {
    static int atoi(String s){
        int i = 0, n = s.length();
        //handle leading whitespaces
        while(i<n && s.charAt(i)==' ') i++;

        //handle sign
        int sign = 1;
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        //convert to digits
        int num = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            //Handle Overflow before it happens
            if(num > (Integer.MAX_VALUE - digit) / 10){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }
        return num * sign;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(atoi(s));
    }
}
