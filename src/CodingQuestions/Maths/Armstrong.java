package CodingQuestions.Maths;

import java.util.Scanner;

public class Armstrong {
    static int countDigits(int x){
        int n = 0;
        while(x!=0){
            n++;
            x /=10;
        }
        return n;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int order = countDigits(n);
        int temp = n;
        int sum = 0;
        while(temp != 0){
            int num = temp%10;
            sum += Math.powExact(num, order);
            temp = temp/10;
        }
        if(sum == n) System.out.println("Armstrong number");
        else System.out.println("not");
    }
}
