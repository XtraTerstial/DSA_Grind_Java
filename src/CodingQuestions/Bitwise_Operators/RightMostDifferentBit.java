package CodingQuestions.Bitwise_Operators;
import java.util.*;
//First take XOR of both number as it gives 0 when bits is same amd 1 if it's different
public class RightMostDifferentBit {
    static int rightDiffBit(int n){
        if(n==0) return 0;
        int isolated = n & -n;
        return (int)(Math.log(isolated)/Math.log(2)) + 1;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(rightDiffBit(x^y));
    }
}
