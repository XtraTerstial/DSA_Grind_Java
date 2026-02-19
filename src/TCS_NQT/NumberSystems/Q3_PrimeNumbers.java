package TCS_NQT.NumberSystems;

import java.util.Scanner;

//Sieve Eratosthenes Method
public class Q3_PrimeNumbers {
    static boolean[] prime(int n){
        boolean[] isPrime = new boolean[n+1];

        for(int i=2;i<=n;i++){
            isPrime[i] = true;
        }

        for(int i=2; i*i <= n ;i++){
            if(isPrime[i]){
                for (int j = i*i; j <= n ; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] isPrime = prime(n);
        for(int i=2; i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }
}
