package CodingQuestions.Bitwise_Operators.KthBit;

import java.util.Scanner;

public class ToggleTheKthBit {
    static void main() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int k = in.nextInt();
        System.out.println(x ^ (1 << k));
    }
}
