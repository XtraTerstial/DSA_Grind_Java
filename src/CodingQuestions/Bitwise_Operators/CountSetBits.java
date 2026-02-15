package CodingQuestions.Bitwise_Operators;

import java.util.Scanner;

public class CountSetBits {
    static int countSets(int n){
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(countSets(x));
    }
}
