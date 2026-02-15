package CodingQuestions.Maths;

import java.util.Scanner;

public class TwoNumbersLCM {
    static int gcd(int a, int b){
        if(a==0)
            return b;
        return gcd(b%a, a);
    }
    static int lcm(int a, int b){
        if(a==0 || b==0) return 0;
        return (a / gcd(a, b)) * b;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(lcm(a,b));
    }
}
