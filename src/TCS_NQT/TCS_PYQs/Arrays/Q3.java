package TCS_NQT.TCS_PYQs.Arrays;

import java.util.Scanner;

public class Q3 {
    static int koko(int n, int[] arr){
        int count = 0;
        for(int i=0;i<=n-2;i++){
            if(arr[i] != arr[i+1]){
                count++;
            }
        }
        if(count > 0) count = count+1;
        return count;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(koko(n, arr));
    }
}
