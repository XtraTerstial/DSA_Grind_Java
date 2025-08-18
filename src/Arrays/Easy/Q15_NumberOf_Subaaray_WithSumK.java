package Arrays.Easy;

import java.util.HashMap;

public class Q15_NumberOf_Subaaray_WithSumK {
    static int subarraySum(int[] arr,int k){
        HashMap<Integer,Integer> prefixSumMap = new HashMap<>();
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i-1];
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int ele = arr[i];
            if (ele == k) count++;
            int rem = ele - k;
            if (prefixSumMap.containsKey(rem)) count += prefixSumMap.get(rem);
            prefixSumMap.put(ele, prefixSumMap.getOrDefault(ele, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int k = 2;
        System.out.println(subarraySum(arr,k));
    }
}
