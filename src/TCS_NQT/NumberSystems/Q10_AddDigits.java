package TCS_NQT.NumberSystems;

import java.util.Scanner;

public class Q10_AddDigits {
    static int addDigits(int n){
        if(n<10) return n;
        return 1+(n-1) % 9;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(addDigits(n));
    }
}
