package TCS_NQT.NumberSystems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q8_AddTwoFractions {
    static long gcd(long a, long b){
        a = Math.abs(a);
        b = Math.abs(b);
        while(b!=0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    static List<Long> addFraction(List<Integer> a, List<Integer> b){
        long n1 = a.get(0);
        long d1 = a.get(1);
        long n2 = b.get(0);
        long d2 = b.get(1);

        if(d1==0 || d2 ==0){
            throw new IllegalArgumentException("Denominator cannot be Zero");
        }
        long numerator = n1 * d2 + n2 * d1;
        long denominator = d1 * d2;

        long factors = gcd(numerator, denominator);

        numerator /= factors;
        denominator /= factors;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        return Arrays.asList(numerator, denominator);
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        System.out.println("Enter Fraction 1");
        System.out.println("Enter Numerator");
        a.add(in.nextInt());
        System.out.println("Enter Denominator");
        a.add(in.nextInt());

        List<Integer> b = new ArrayList<>();
        System.out.println("Enter Fraction 2");
        System.out.println("Enter Numerator");
        b.add(in.nextInt());
        System.out.println("Enter Denominator");
        b.add(in.nextInt());

        List<Long> ans = addFraction(a,b);
        System.out.println(ans.get(0)+"/"+ans.get(1));
    }
}
