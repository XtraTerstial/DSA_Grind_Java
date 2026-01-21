package Algorithms.Recusrion.Practise_Easy;

import java.util.Scanner;
// Fibonacci series = 0 1 1 2 3 5 8 13 21 34 55 89 ...
public class P5_NthFibonacci {
    static int fibonacci(int n){
//        if(n==0) return 0;
//        if(n==1) return 1;
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fibo = fibonacci(n);
        System.out.println(fibo);
    }
}
