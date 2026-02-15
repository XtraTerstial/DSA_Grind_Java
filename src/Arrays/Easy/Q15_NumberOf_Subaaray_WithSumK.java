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
    static int longestSubarraySum(int[] arr){ //when k is not given
        int sum = 0;
        int maxi = 0;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum == 0)
                maxi = i+1;
            else{
                if(prefixSumMap.containsKey(sum)){
                    maxi = Math.max(maxi, i-prefixSumMap.get(sum));
                }
                else{
                    prefixSumMap.put(sum, i);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};
        int k = 6;
        System.out.println(subarraySum(arr,k));
    }
}
