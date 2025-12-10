package BentlySystems.Day1;
import java.util.*;
public class MaxNumberOfKPairs {
    public static int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int operations = 0;

        for(int i=0;i<nums.length;i++) {
            int dif = k - nums[i];
            if(map.getOrDefault(dif, 0)>0) {
                operations++;
                map.put(dif,map.get(dif)-1);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return operations;
    }

    static void main() {
        int[] arr = {3,1,3,4,3,3,3};
        System.out.println(maxOperations(arr,5));
    }
}
