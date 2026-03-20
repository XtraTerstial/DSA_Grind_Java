package CodingQuestions.Bitwise_Operators;
import java.util.*;
//First take XOR of both number as it gives 0 when bits is same amd 1 if it's different
/*x = 11  → 1011
y = 9   → 1001
x ^ y = 0010

The rightmost 1 in 0010 indicates the first different bit from the right.*/
public class Q38_RightMostDifferentBit {
    static int rightDiffBit(int n){
        return n==0 ? 0 : Integer.numberOfTrailingZeros(n)+1;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(rightDiffBit(x^y));
    }
}
