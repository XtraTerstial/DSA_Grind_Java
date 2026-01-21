package Algorithms.Recusrion.Practise_Easy;

import java.util.Scanner;

public class P1_FindFactorial {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial of "+n+" is = " + fact);
    }

    private static int factorial(int n) {
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
}
