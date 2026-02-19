package Arrays.Medium;

import java.util.HashMap;

public class Q11_SubArraySumK {
    static int sumEqualsK(int[] arr, int k){
        HashMap<Integer,Integer> prefixSumMap = new HashMap<>();
        int prefixSum = 0;
        prefixSumMap.put(0,1);
        int count = 0;
        for (int ele:arr){
            prefixSum += ele;
            int diff = prefixSum - k;
            if(prefixSumMap.containsKey(diff)){
                count += prefixSumMap.get(diff);
            }
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
    static void main() {
        int[] nums = {3, 1, 2, 4, 1, 5};
        int k = 6;
        System.out.println(sumEqualsK(nums, k));
    }
}
