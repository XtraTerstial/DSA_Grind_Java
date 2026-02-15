package Arrays.Medium;
//LeetCode :- 167
import java.util.HashMap;

public class Q10_Two_Sum_2 {
    static int[] twoSumTwo(int[] nums, int t){
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int comp = t - nums[i];
            if(map.containsKey(comp)){
                return new int[] {map.get(comp), i+1};
            }
            else{
                map.put(nums[i], i+1);
            }
        }
        return new int[0];
    }
    static int[] twoSumIndex(int[] nums, int t){
        int n = nums.length;
        int left = 0, right = n-1;
        while(left <= right){
            int sum = nums[left] + nums[right];
            if(sum == t) return new int[] {left+1, right+1};
            else if(sum > t) right--;
            else left++;
        }
        return new int[0];
    }
    static void main() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSumIndex(nums, target);
        for(int ele:ans){
            System.out.print(ele+" ");
        }

    }
}
