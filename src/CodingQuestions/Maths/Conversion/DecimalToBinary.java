package CodingQuestions.Maths.Conversion;

import java.util.Scanner;

public class DecimalToBinary {
    static int decimalToBinary2(int num) {
        int binary = 0;
        int i = 1;
        for (int j = num; j > 0 ; j/=2) {
            binary = binary + (num%2)*i;
            i*=10;
            num/=2;
        }
        return binary;
    }

    static String decimalToBinary(int num) {
        if (num == 0) return "0";
        StringBuilder binary = new StringBuilder();
        int i = 0;

        while (num != 0) {
            binary.append(num%2);
            num = num / 2;
            i++;
        }
        binary.reverse();
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String a = decimalToBinary(n);


        System.out.println(decimalToBinary2(n));
    }
}
