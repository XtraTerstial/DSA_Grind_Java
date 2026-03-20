package CodingQuestions.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Q15_PairExistance {
    static int[] twoSum(int[] a, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length ; i++) {
            int diff = target - a[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }
            map.put(a[i], i);
        }
        return new int[0];
    }
    static void main() {
        int[] arr = {0,2,5,7,4,6,10,-20,10};
        int target = 10;
        int[] ans = twoSum(arr, target);
        for (int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
