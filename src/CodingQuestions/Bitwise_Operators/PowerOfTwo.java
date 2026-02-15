package CodingQuestions.Bitwise_Operators;

import java.util.Scanner;

//Check if number is power of 2
public class PowerOfTwo {
    static void main() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int a = x&(x-1);
        if(a==0) System.out.println("Yes");
        else System.out.println("Not");
    }
}
