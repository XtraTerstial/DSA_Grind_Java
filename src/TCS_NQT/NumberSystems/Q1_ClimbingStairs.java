package TCS_NQT.NumberSystems;
//Leetcode :- 70
//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

import java.util.Scanner;

public class Q1_ClimbingStairs {
    static int climbing(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        int[] steps = new int[n];
        steps[0] = 1; steps[1] = 2;
        for (int i = 2; i < n; i++) {
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[n-1];
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(climbing(n));
    }
}
