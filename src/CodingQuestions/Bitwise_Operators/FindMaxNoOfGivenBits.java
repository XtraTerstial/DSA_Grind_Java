package CodingQuestions.Bitwise_Operators;

import java.util.Scanner;

//40
/*
Input i =2, L = 3;
Output: 6
2^3-2
 */
public class FindMaxNoOfGivenBits {
    static int maxNoOfBits(int i, int l){
        int product = 1;
        for(int j = 1; j <= l; j++){
            product *= 2;
        }
        return product-i;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int l = in.nextInt();
        System.out.println(maxNoOfBits(i, l));
    }
}
