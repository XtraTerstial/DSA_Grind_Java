package Arrays.Medium.Two_D_Array;

public class Set_Matrix_Zero {
    static void optimal(int[][] arr){
        int n = arr.length;
        int m = arr.length;
         int[] r=new int[n];
         int[] c = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==0){
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(r[i]==1 || c[j]==1){
                    arr[i][j]=0;
                }
            }
        }
    }
    // nice time but uses extra space
    static void best(int[][] arr){
        int n = arr.length, m = arr[0].length;
        boolean firstRow = false, firstCol = false;
        //Set  markers in first row and first column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==0){
                    if(i == 0) firstRow = true;
                    if(j == 0) firstCol = true;
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        // Replace inner matrix
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }
        // Last remaining checks
        if(firstRow)
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
            }
        if(firstCol)
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
    }
    public static void main(String[] args) {
        Print p  = new Print();
        int[][] ans = {{1,1,1},{1,0,1},{1,1,1}};
        p.printMatrix(ans);
        System.out.println("set zero :>");
        best(ans);
        p.printMatrix(ans);
    }
}
