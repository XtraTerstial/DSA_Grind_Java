package CodingQuestions.Maths;

import java.util.Scanner;

public class KangarooJump {
    static boolean canJump(int n){
        return n > 0 && (n & (n-1)) == 0; //check power of 2;
//        return n > 0 && (n & (n-1)) == 0 && (n & 0x55555555) != 0; power of 4 check
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int distance = in.nextInt();
        System.out.println(canJump(distance));
    }
}
