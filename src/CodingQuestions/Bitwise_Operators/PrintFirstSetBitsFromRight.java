package CodingQuestions.Bitwise_Operators;

import java.util.*;

public class PrintFirstSetBitsFromRight {
    static int rightSetBit(int n){
        if(n==0) return 0;
        int isolated = n & -n;
        return (int)(Math.log(isolated)/Math.log(2)) + 1;
    }
    static int rightSetBits2(int n){
        if(n==0) return 0;
        return Integer.numberOfTrailingZeros(n) + 1;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    }
}
