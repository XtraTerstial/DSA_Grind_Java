package TCS_NQT.NumberSystems;

import java.util.Scanner;

public class Q7_ValidPerfectSquares {
    static boolean validSq(int n){
        int lo = 1;
        int hi = n;
        while(lo <= hi){
            int mid = lo +(hi-lo) / 2;
            int sq = mid*mid;
            if(sq == n) return true;
            if(sq>mid) hi = mid-1;
            else lo = mid+1;
        }
        return false;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(validSq(n));
    }
}
