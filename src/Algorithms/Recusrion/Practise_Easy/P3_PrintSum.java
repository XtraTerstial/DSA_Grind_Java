package Algorithms.Recusrion.Practise_Easy;

import java.util.Scanner;

public class P3_PrintSum {
    static int printSum(int n){
        if(n==1 || n==0)
            return n;
        return n + printSum(n-1);
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = printSum(n);
        System.out.println(sum);
    }
}
