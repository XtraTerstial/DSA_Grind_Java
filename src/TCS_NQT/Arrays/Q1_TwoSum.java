package TCS_NQT.Arrays;

import java.util.*;

public class Q1_TwoSum {
    static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[] {diff, nums[i]};
            }else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }
    static void main() {
        int[] arr = {4,6,7,5,3,7};
        int target = 9;
        int[] ans = twoSum(arr,target);
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
