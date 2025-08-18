package Arrays.Hard;

import java.util.*;

public class Q5_CountSubarraysWithGivenXor {
    static int countXOR(int[]arr, int k){
        Map<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        // Step 1: Build prefix XOR in place
        for (int i = 1; i < n; i++) {
            arr[i] ^= arr[i-1];
        }
        int count = 0;
        for(int i = 0;i<n;i++){
            int ele = arr[i];
            // If subarray from 0..i has XOR == k
            if(ele == k) count++;

            // If there exists a prefix that makes XOR == k
            int required = ele^k;
            if(map.containsKey(required)) count += map.get(required);

            // Store current prefix XOR frequency
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
//        countXOR(arr,k);
        System.out.println(countXOR(arr,k));
    }
}
