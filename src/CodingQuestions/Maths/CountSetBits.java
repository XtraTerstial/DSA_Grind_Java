package CodingQuestions.Maths;

import java.util.Scanner;

//set bit = 1 || reset bit = 0;
//eg:- 10 = 1010 -> 2 set bits
public class CountSetBits {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countSetBits(n));
    }

    private static int countSetBits(int n) {
        //Convert to Binary and count nos of 1's
        int binary = 0;
        int i = 1;
        for(int j = n; j > 0 ; j/=2){
            binary = binary + (n%2)*i;
            n /= 2;
            i *= 10;
        }
        int count = 0;
        while(binary != 0){
            int bits = binary%10;
            if(bits == 1) count++;
            binary /= 10;
        }
        return count;
    }
}
