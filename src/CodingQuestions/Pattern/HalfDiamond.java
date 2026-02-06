package CodingQuestions.Pattern;

import java.util.Scanner;

public class HalfDiamond {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.print(i+" ");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = i-1; j >= 1; j--) {
                System.out.print(i+" ");
            }
            System.out.print(i+" ");
            System.out.println();
        }
    }
}
