package Algorithms.backtracking;

import java.util.Scanner;

public class mazePath {
    static void main() {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int count = maze(1,1,rows,cols);
        System.out.println(count);
    }

    // sr/sc: Starting row/column & er/ec: Ending row/column
    private static int maze(int sr, int sc, int er, int ec) {
        if(sr>er || sc>ec) return 0;
        if(sr==er || sc==ec) return 1;
        int downWays = maze(sr+1,sc,er,ec);
        int rightWays = maze(sc+1,sr,er,ec);
        int totalWays = downWays + rightWays;
        return totalWays;
    }

}
