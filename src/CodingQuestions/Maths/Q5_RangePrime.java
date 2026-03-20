package CodingQuestions.Maths;

import java.util.Scanner;

//Given a & b. Find all prime numbers in between them
public class Q5_RangePrime {
    static boolean[] sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i <= n ; i++) {
            if(isPrime[i]){
                for (int j = i*i; j <= n ; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        // Fix reversed range
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Prime numbers start from 2
        if (a < 2) a = 2;

        boolean[] isPrime = sieve(b);
        for (int i = a; i <= b ; i++) {
            if (isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }
}
