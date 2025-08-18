package Arrays.Medium.Two_D_Array;

public class Q2_Matrix_Multiplication {
    static void print(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] multiplication(int[][]arr,int row1,int col1, int[][] arr2,int row2,int col2) throws Exception{
        if(col1 != row2) throw  new Exception ("not possible addition");
        int[][] ans = new int[row1][col2];
        for (int i = 0; i < row1 ; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) { //row2
                    ans[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{9,8,7},{6,5,4},{3,2,1}};
        int row1 = arr.length, col1 = arr[0].length;
        int row2 = arr2.length, col2 = arr2[0].length;
        int[][]ans =  multiplication(arr,row1,col1,arr2,row2,col2);
        print(ans);
    }
}
