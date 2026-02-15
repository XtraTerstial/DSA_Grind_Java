package CodingQuestions.Maths;

import java.util.Scanner;

public class DistanceBetweenTwoCords {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x1 and y1 :");
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        System.out.println("Enter x2 and y2 :");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        System.out.println(distanceBetween(x1,y1, x2, y2));

    }

    private static double distanceBetween(int x1, int y1, int x2, int y2) {
        int dx = x2-x1;
        int dy = y2-y1;
        return Math.sqrt((dx*dx)+(dy*dy));
    }
}

