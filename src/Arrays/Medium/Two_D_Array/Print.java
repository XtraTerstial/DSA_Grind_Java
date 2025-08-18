package Arrays.Medium.Two_D_Array;

public class Print {
    public void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void printArray(int[] arr){
        for (int ele:arr){
            System.out.print(ele+", ");
        }
    }
}
