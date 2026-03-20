package CodingQuestions.Bitwise_Operators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShortCuts {
    static int rightSetBits(int n){
        return n==0 ? 0 : Integer.numberOfTrailingZeros(n)+1;
    }

    static int leftSetBits(int n){
        return n==0 ? 0 : Integer.numberOfLeadingZeros(n)+1;
    }
    static int countSetBits(int n){
        return n==0 ? 0 : Integer.bitCount(n);
    }

    //given a number n, find the nearest power of 2 from that numbe
    //Eg :- n = 13, nearest power of 2 from 13 is 8
    static int largestPowerOfTwo(int n){
        return n == 0 ? 0 : Integer.highestOneBit(n);
    }

    //Eg :- n = 13, nearest but lowest power of 2 from 13 is 4
    static int lowestPowerOfTwo(int n){
        return n==0? 0 : Integer.lowestOneBit(n);
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(rightSetBits(n));
        System.out.println(leftSetBits(n));
        System.out.println(countSetBits(n));
        System.out.println(largestPowerOfTwo(n));
        System.out.println(lowestPowerOfTwo(n));
    }
}
