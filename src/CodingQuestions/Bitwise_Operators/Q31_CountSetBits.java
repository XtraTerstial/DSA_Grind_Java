package CodingQuestions.Bitwise_Operators;

import java.util.Scanner;

public class Q31_CountSetBits {
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
        System.out.println(Integer.bitCount(x));
    }
}
