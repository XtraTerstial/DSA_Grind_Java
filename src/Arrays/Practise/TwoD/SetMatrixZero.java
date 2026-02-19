package Arrays.Practise.TwoD;

public class SetMatrixZero {
    static void setZero(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int[] r = new int[n];
        int[] c = new int[m];
        for(int i=0; i<n;i++){
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==0){
                    r[i] = 0;
                    c[j] = 0;
                }
            }
        }
        for(int i=0; i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (r[i] == 1 || c[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }

    }
    static void main() {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};

    }
}
