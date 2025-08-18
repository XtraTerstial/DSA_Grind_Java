package Arrays.Medium;
import Arrays.Medium.Two_D_Array.Print;

import java.util.*;
/*Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.*/
public class Q6_Rerrange_acc_Sign {
    static int[] rearrange(int[] arr) {
        int n=arr.length;
        int posIndex = 0,negIndex = 1;
       int[] ans = new int [n];
        for (int i = 0; i < n; i++) {
            if(arr[i] >= 0){
                ans[posIndex] = arr[i];
                posIndex +=2;
            } else{
                ans[negIndex] = arr[i];
                negIndex+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Print p1 = new Print();
        int[] arr = {3,1,-2,-5,2,-4};
        p1.printArray(arr);
        // ans -> {3,-2,1,-5,2,-4};
        System.out.println();
        System.out.println("After rearranging :>");

        int[]ans = rearrange(arr);
        System.out.println("Output: " + Arrays.toString(ans));
        /*for(int ele:ans){
            System.out.print(ele+" ");
        }*/
    }
}
