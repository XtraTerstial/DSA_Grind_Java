package Algorithms.Recusrion.Practise_Easy;

import java.util.Scanner;

//Take n from user and print n to 1
public class P2_PrintNto1 {
    static void printTo1(int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        printTo1(n-1);
    }
    static void print1ToN(int n){
        if(n==0)
            return;
        print1ToN(n-1);
        System.out.print(n+" ");
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print1ToN(n);
    }
}
