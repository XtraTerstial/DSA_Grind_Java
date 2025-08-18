package Arrays.Hard;

import java.util.*;

public class Q4_MaxSubarrayWithSum0 {
    static int numberOfSubarrayWithSumZero(int[] nums){
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i-1];
        }
        for (int i=0;i<n;i++){
            int ele = nums[i];
            if(ele==0) count+=1;
            if(map.containsKey(ele)) count+=map.get(ele);
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        return count;
    }

    static int longestSubarraywithSumZero(int [] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        int sum = -1;
        int maxLen = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum==0){
                maxLen = i+1;
            }
            if(map.containsKey(sum)) {
                maxLen = Math.max(maxLen,i-map.get(sum));
            }
            else map.put(sum,i);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};
        System.out.println(longestSubarraywithSumZero(arr));
        System.out.println("Total number of subarray with sum 0 :>");
        System.out.println(numberOfSubarrayWithSumZero(arr));
    }
}
