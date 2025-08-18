package Arrays.Medium.Two_D_Array;
import java.util.*;
/*first -> tarnspose
second -> reverse*/
public class Q4_Rotate {
    static void print(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swap(int[] arr){
        int i=0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
    static int[][] tarnspose(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        int[][]ans = new int[c][r];
        for (int i = 0; i < c ; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }
    static int[][] rotate(int[][]arr){
        int[][]ans =  tarnspose(arr);
        int r = ans.length;
        for (int i = 0; i < r; i++) {
            swap(ans[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{7,8,9}};
        int row1 = arr.length, col1 = arr[0].length;
        print(arr);
        int[][] ans = tarnspose(arr);
        System.out.println("After transpose");
        print(ans);
        int[][]ans2 = rotate(ans);
        System.out.println("rotated matric :> ");

        print(ans2);

    }
}
