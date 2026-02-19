package TCS_NQT.NumberSystems;

import java.util.Scanner;

//1 1 2 3 5 8 13 21 34 55 89
public class Q9_FibonacciNumber {
    static long nthFibo(int n){
        if(n==0 || n==1) return n;

        long prev2 = 0;
        long prev1 = 1;
        for(int i=2;i<=n;i++){
            long curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(nthFibo(n));
    }
}
