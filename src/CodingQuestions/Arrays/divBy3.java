package CodingQuestions.Arrays;

import java.util.Scanner;

public class divBy3 {
    static int digitSum(int n){
        int sum = 0;
        while(n != 0){
            int temp = n%10;
            sum += temp;
            n = n/10;
        }
        return sum;
    }
    static boolean checkDivis (int[] arr){
        int sum = 0;
        for(int i=0;i< arr.length;i++){
            sum += digitSum(arr[i]);
        }
        return sum%3 == 0;
    }

    static boolean checkDivis2(int[] arr){
        int remainder = 0;

        for(int i = 0;i<arr.length;i++){
            remainder = (remainder+arr[i]) % 3;
        }
        return remainder == 0;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(checkDivis2(arr));
    }
}
