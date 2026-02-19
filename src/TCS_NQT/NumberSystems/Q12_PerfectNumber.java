package TCS_NQT.NumberSystems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q12_PerfectNumber {

    static boolean prefectNumber(int n){ //T.C ->O(n)
        int sum = 0;
        for (int i = 1; i < n ; i++) {
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n;
    }
    static boolean perfect(int n){ //T.C -> O(√n)
        if(n<=1) return false;

        int sum = 1;

        for(int i = 2; i*i <= n; i++){
            if(n%i==0){
                sum += i;

                if(i != n/i);
                {
                    sum += n / i;
                }
            }
        }
        return sum==n;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(prefectNumber(n));
    }
}
