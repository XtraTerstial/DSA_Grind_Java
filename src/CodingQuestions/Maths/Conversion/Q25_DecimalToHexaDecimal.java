package CodingQuestions.Maths.Conversion;

import java.util.Scanner;

public class Q25_DecimalToHexaDecimal {
    static String decimalToHexaDecimal(int num) {
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            int temp = num % 16;
            if(temp<10){
                sb.append((char)(temp+48));
            }else{
                sb.append((char)(temp+55));
            }
            num = num/16;
        }
        return sb.toString();
    }
    static String toHexaDecimal(int num){
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();
//        boolean isNegative = false;
//        if(num < 0){
//            isNegative = true;
//            num = -num;
//        }
        while(num!=0){
            int temp = num&15;
            if(temp<10){
                sb.append((char)(temp + '0'));
            }else{
                sb.append((char)(temp-10 + 'a'));
            }
            num >>>= 16;
        }
//        if (isNegative) sb.append('-');
        return sb.reverse().toString();
    }
    static void main(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = toHexaDecimal(n);
        System.out.println(s);
    }
}