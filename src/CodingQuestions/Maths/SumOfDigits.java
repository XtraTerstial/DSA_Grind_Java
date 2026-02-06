package CodingQuestions.Maths;

import java.util.Scanner;

public class SumOfDigits {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n = Math.abs(n);
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n = n/10;
        }
        System.out.println(sum);
    }
}
