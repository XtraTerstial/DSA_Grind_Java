package CodingQuestions.Maths;

import java.util.Scanner;

public class Q39_ReturnRemainder {
    static int remainder(int num, int divisor){
        if(divisor > num) return num;
//        return num % divisor;
        return (num - divisor * ( num / divisor));
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int nums1 = in.nextInt();
        int nums2 = in.nextInt();
        System.out.println(remainder(nums1, nums2));
    }
}
