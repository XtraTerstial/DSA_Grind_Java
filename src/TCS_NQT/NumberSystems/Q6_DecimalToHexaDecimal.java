package TCS_NQT.NumberSystems;

import java.util.Scanner;

//LeetCode :- 405
public class Q6_DecimalToHexaDecimal {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(toHex(n));
    }

    private static String toHex(int num) {
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();

        while(num != 0){
            int temp = num&15;
            if(temp<10){
                sb.append((char)(temp + '0'));
            }else{
                sb.append((char)(temp-10 + 'a'));
            }
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}
