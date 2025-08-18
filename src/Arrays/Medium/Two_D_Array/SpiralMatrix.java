package Arrays.Medium.Two_D_Array;

import java.util.*;

public class SpiralMatrix {
    static List<Integer> spiral(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        List<Integer> ans = new ArrayList<>();

        int minr = 0, maxr = n - 1;
        int minc = 0, maxc = m - 1;

        while (minr <= maxr && minc <= maxc) {
            // Top row: left to right
            for (int j = minc; j <= maxc; j++) {
                ans.add(arr[minr][j]);
            }
            minr++;

            // Right column: top to bottom
            for (int i = minr; i <= maxr; i++) {
                ans.add(arr[i][maxc]);
            }
            maxc--;

            // Bottom row: right to left
            if (minr <= maxr) {
                for (int j = maxc; j >= minc; j--) {
                    ans.add(arr[maxr][j]);
                }
                maxr--;
            }

            // Left column: bottom to top
            if (minc <= maxc) {
                for (int i = maxr; i >= minr; i--) {
                    ans.add(arr[i][minc]);
                }
                minc++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ArrayList<Integer> ans = (ArrayList<Integer>) spiral(arr);
        System.out.println(ans);  // Output should be [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
