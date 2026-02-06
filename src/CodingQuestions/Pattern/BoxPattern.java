package CodingQuestions.Pattern;

import java.util.Scanner;

public class BoxPattern {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Give rows and columns");
        int rows = in.nextInt();
        int cols = in.nextInt();
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols; j++) {
                if(i==0 || i==rows || j==0 || j==cols){
                    System.out.print(1);
                }
                else System.out.print(0);
            }
            System.out.println();
        }
    }
}
