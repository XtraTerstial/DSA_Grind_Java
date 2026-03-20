package CodingQuestions.Maths;
// 1
import java.math.BigInteger;
import java.util.Scanner;

public class Q1_FindFactorial {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger fact = BigInteger.ONE;
        for (int i = n; i > 0 ; i--) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of "+n+" is = "+fact);
    }
}
