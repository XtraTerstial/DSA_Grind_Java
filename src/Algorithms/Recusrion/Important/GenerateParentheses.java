package Algorithms.Recusrion.Important;

import java.util.Scanner;
//Example 1:
//Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]
//
//Example 2:
//Input: n = 1
//Output: ["()"]

public class GenerateParentheses {
    static void print(int open, int close, int n, String s){
        if(s.length() == 2*n){
            System.out.println(s);
            return;
        }
        if(open<n) print(open+1, close, n, s+"(");
        if(close<open) print(open,close+1, n, s+")");
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(0,0,n,"");
    }
}
