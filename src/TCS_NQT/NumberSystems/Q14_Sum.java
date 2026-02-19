package TCS_NQT.NumberSystems;

import java.util.Scanner;

public class Q14_Sum {
    static int sum(int n){
        return n * (n+1)/2;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sum(n));
    }
}
