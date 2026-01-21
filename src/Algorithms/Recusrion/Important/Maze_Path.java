package Algorithms.Recusrion.Important;

import java.util.Scanner;

//Also known as -> Rat in a maze / Uniques Paths
public class Maze_Path {
    static int maze(int row, int col, int m, int n){
        if(row==m || col==n) return 1;// base case
        int rightways = maze(row, col+1, m, n );
        int downways = maze(row+1, col, m, m);
        return rightways + downways;
    }
    static int maze2(int m, int n){
        if(m==1 || n==1) return 1;
        int rightways = maze2(m, n-1 );
        int downways = maze2(m-1, m);
        return rightways + downways;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.println(maze(1,1,m,n));
    }
}
