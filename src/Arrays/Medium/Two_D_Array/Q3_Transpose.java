package Arrays.Medium.Two_D_Array;

public class Q3_Transpose {
    static void print(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transpose(int[][] arr,int r1 , int c1){
        //in place transpose work for square matrix not for rectangle matrix
        int[][] ans = new int[c1][r1];
        for (int i = 0; i < c1; i++) {
            for (int j = i; j < r1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static int[][] transpose2(int[][] arr, int r, int c){
        //best work for both square and rectangle
        int[][] ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{7,8,9}};
        int row1 = arr.length, col1 = arr[0].length;
        print(arr);
        System.out.println("Transpose:-");
        int[][]ans =  transpose2(arr,row1,col1);
        print(ans);
    }
}
