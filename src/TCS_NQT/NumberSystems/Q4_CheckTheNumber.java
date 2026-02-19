package TCS_NQT.NumberSystems;

import java.util.Scanner;

public class Q4_CheckTheNumber extends Thread{
    static void checkNumber(int n) throws InterruptedException {
        if(n>0){
            System.out.println("Positive Number");
        } else if(n<0) {
            System.out.println("Negative Number");
        }else{
            System.out.println("ZERO");
        }
        Thread.sleep(2500);
        if(n%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd number");
        }
    }
    static void main() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        checkNumber(n);
    }
}
