package Algorithms.backtracking;

import java.util.Scanner;

public class FourDirectionMazePath {
    static void main() {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        print(1,1,rows,cols,"");
    }

    private static void print(int sr, int sc, int er, int ec, String s) {
        if(sr>er || sc>ec) return;
        if(sr==er || sc==ec){
            System.out.println(s);
            return;
        }

        //go right
        print(sr, sc+1, er, ec, "R");

        //go Down
        print(sr+1, sc, er, ec, "D");

        //go Left
        print(sr-1, sc, er, ec, "L");

        //go Up
        print(sr-1, sc, er, ec, "U");
    }
}
