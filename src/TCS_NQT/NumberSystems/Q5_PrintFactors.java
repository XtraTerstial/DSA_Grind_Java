package TCS_NQT.NumberSystems;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5_PrintFactors {
    static void printDivisor(int n){
        if(n==0) return;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i*i<=n ;i++){
            if(n%i==0){
                if (n / i == i) {
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printDivisor(n);
    }
}
