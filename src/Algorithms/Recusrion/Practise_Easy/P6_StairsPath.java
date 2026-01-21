package Algorithms.Recusrion.Practise_Easy;

import java.util.Scanner;

//Find no of ways to reach nth stairs if 1 or 2 jump at a time is allowed
public class P6_StairsPath {
    static int countPaths(int n){
        if(n<=2) return n;
        return countPaths(n-1)+countPaths(n-2);
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int path = countPaths(n);
        System.out.println(path);
    }
}
