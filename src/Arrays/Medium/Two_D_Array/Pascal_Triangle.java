package Arrays.Medium.Two_D_Array;

import java.util.Scanner;

public class Pascal_Triangle {
    static int[][] spiral(int n){
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Print p1 = new Print();
        int n = in.nextInt();
        int[][] ans = spiral(n);
        for (int[] row : ans) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
