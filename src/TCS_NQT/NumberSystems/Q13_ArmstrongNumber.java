package TCS_NQT.NumberSystems;

import java.util.Scanner;

public class Q13_ArmstrongNumber {
    static long power(long n, int x){
        if(x==0) return 1;
        long half = power(n, x/2);
        if(x%2==0)
            return half * half;
        return n * half * half;
    }
    static int order(int n){
        if(n==0) return 1;
        int count = 0;
        while(n!=0){
            count ++;
            n /= 10;
        }
        return count;
    }
    static boolean armstrong(int n ){
        int x = order(n);
        int num = n;
        long sum = 0;
        while(num != 0){
            int temp = num%10;
            sum += power(temp,x);
            num /= 10;
        }
        return sum==n;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(armstrong(n));
    }
}
