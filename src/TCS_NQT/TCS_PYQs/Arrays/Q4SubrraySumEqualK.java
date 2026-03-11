package TCS_NQT.TCS_PYQs.Arrays;

import java.util.*;

public class Q4SubrraySumEqualK {
    static void sumEqualK(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int bestStart = Integer.MAX_VALUE;
        int bestEnd = -1;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if(prefixSum == k){
                int start = 1;
                int end = i+1;

                if(start < bestStart){
                    bestStart = start;
                    bestEnd = end;
                }
            }

            if(map.containsKey(prefixSum-k)){
                int start = map.get(prefixSum-k)+2;
                int end = i+1;

                if(start < bestStart){
                    bestStart = start;
                    bestEnd = end;
                }
            }
            map.putIfAbsent(prefixSum, i);
        }
        System.out.println(bestStart+" "+bestEnd);
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();

        sumEqualK(arr, k);
    }

}
