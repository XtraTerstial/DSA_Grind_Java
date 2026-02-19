package Arrays.Practise.TwoD;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static List<Integer> spiral(int[][] nums){
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int m = nums[0].length;
        int minr = 0, maxr = n-1;
        int minc = 0, maxc = m-1;

        while(minc <= maxc && minr <= maxr) {
            //left to right
            for (int j = minc; j <= maxc; j++) {
                ans.add(nums[minr][j]);
            }
            minr++;
            // top to bottom
            for (int i = minr; i <= maxr; i++) {
                ans.add(nums[i][maxc]);
            }
            maxc--;

            if(minr <= maxr){
                for (int j = maxc; j >= minc ; j--) {
                    ans.add(nums[maxr][j]);
                }
                maxr--;
            }
            if(minc<=maxc){
                for (int i = maxr; i >= minr ; i--) {
                    ans.add(nums[i][minc]);
                }
                minc++;
            }
        }
        return ans;
    }

    static void main() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ArrayList<Integer> ans = (ArrayList<Integer>) spiral(arr);
        System.out.println(ans);// Output should be [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
