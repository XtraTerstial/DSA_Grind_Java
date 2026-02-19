package TCS_NQT.NumberSystems;

import java.util.*;
//LeetCode :- 202
public class Q18_HappyNumber {
    static int sqSum(int n){
        int sum = 0;
        while(n>0){
            int temp = n%10;
            sum += temp * temp;
            n /= 10;
        }
        return sum;
    }
    static boolean happyNumber(int n){
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if(set.contains(n)) return false;
            set.add(n);
            n = sqSum(n);
        }
        return true;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(happyNumber(n));
    }
}
