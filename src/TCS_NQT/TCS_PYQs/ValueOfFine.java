package TCS_NQT.TCS_PYQs;

import java.util.Scanner;

public class ValueOfFine {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int date = in.nextInt();
        int fineVal = in.nextInt();

        int evenCount = 0, oddCount = 0;
        for(int ele:arr){
            if(ele%2 != 0) oddCount++;
            else evenCount ++;
        }
        int totalFine = 0;
        if(date % 2 == 0){
            totalFine = fineVal * oddCount;
        }else{
            totalFine = fineVal * evenCount;
        }
        System.out.println(totalFine);
    }
}
