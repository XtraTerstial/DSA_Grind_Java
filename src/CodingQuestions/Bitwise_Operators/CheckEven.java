package CodingQuestions.Bitwise_Operators;

import java.util.Scanner;

public class CheckEven {
    static void main() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if((x&1) == 0) System.out.println("EVEN");
        else System.out.println("ODD");
    }
}
