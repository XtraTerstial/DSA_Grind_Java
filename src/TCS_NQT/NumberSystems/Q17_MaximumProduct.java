package TCS_NQT.NumberSystems;

import java.util.Arrays;

public class Q17_MaximumProduct {
    static int maxProduct(int[] arr){
        int product = 1;
        int ansStart = 0, ansEnd = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int n = arr.length;
        for(int i = 0; i<n;i++){
            if(product == 1) start = i;
            product *= arr[i];
            if(max < product){
                ansStart = start;
                ansEnd = i;
                max = product;
            }
            if(product == 0) product =1;
        }
        return max;
    }
    static int maxProduct2(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;

        int prod1 = arr[n-1] * arr[n-2] * arr[n-3];
        int prod2 = arr[0] * arr[1] * arr[2];

        return Math.max(prod1, prod2);
    }
    static void main() {
        int[] arr = {1,2,3,4,0,5,6};
        System.out.println(maxProduct2(arr));
    }
}
