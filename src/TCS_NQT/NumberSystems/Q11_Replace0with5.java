package TCS_NQT.NumberSystems;

import java.util.Scanner;

public class Q11_Replace0with5 {
    static int reverse(int n){
        int num = 0;
        while(n!=0){
            int temp = n%10;
            num = num*10+temp;
            n /= 10;
        }
        return num;
    }
    static int replace(int n){
        int num = 0;
        while(n>0){
            int temp = n%10;
            if(temp==0) temp = 5;
            num = num*10+temp;
            n /= 10;
        }
        return reverse(num);
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(replace(n));
    }
}
