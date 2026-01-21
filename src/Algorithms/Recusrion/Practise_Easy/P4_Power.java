package Algorithms.Recusrion.Practise_Easy;

import java.util.Scanner;

public class P4_Power {
    static int power(int a, int b){ //TC :- O(b)
        if(b==0) return 1;
//        if(b==1) return a;
        return a * power(a, b-1);
    }
    static int power2(int a, int b){ //efficient TC ->O(log b)
        if(b==0) return 1;
        int ans = power2(a,b/2);
        if(b%2==0) return ans * ans;
        else return ans*ans*a;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        //a^b
        int pow = power2(a, b);
        System.out.println(a+" to the power "+b+" is = "+pow);
    }
}
