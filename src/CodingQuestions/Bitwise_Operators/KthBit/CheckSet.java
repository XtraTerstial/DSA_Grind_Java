package CodingQuestions.Bitwise_Operators.KthBit;

import java.util.Scanner;
//Check if kth bit is set
public class CheckSet {
    static void main() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int k = in.nextInt();
        if ((x & (1 << (k - 1))) != 0) System.out.println("Not Set");
        else System.out.println("Set");
    }
}
