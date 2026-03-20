package CodingQuestions.Maths;

import java.util.Scanner;

public class Q8_MinOf4Numbers {
    static void main() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int min = 0;
        if(a<b) min = a;
        else min = b;

        if(c < min) min = c;
        if(d < min) min = d;
        System.out.println(min);
    }
}
