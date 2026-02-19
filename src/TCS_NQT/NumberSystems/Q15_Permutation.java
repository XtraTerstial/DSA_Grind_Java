package TCS_NQT.NumberSystems;

import java.util.Scanner;

//Permutations to arrange N persons around a circular table
//FORMULA :- (n-1)!
public class Q15_Permutation {
    static long factorial(int n){
        long result = 1;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
        return result;
    }
    static long circularPermutation(int n) {
        if(n<=1) return n;
        return factorial(n-1);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(circularPermutation(n));

    }
}
