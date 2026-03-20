package CodingQuestions.Maths;

import java.util.Scanner;

public class Q6_SumPrime extends Thread{
    static boolean[] sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i < n; i++) {
            if (isPrime[i]){
                for (int j = i*i; j < n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a>b){
            int temp = a;
            a = b;
            b= temp;
        }
        if(a<2) a=2;
        int sum = 0;
        boolean[] isPrime = sieve(b);
        for (int i = a; i <= b; i++) {
            if(isPrime[i]){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
