package Arrays.Medium.Two_D_Array;
import java.util.Arrays;
// row and colums should be same for both matrix
public class Q1_Addition {
    static void print(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static int[][] matrixAdd(int[][] arr, int[][] arr2) {
        int n = arr.length;
        int m = arr2.length;
        int[][] ans = new int[n][m];
        for(int i=0;i<n;i++){
            for (int j = 0; j <m; j++) {
                ans[i][j] = arr[i][j]+arr2[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};
        int[][] ans = matrixAdd(arr,arr2);
        print(ans);

    }
}
