package BentlySystems.Day1;
import java.util.*;
// find last and first position of an element
public class findLastAndFrist {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] pos = {-1,-1};
        int lo = 0, hi = n-1;
        while(lo<=hi) {
            int mid = lo + (hi-lo) / 2;
            if(nums[mid] == target) {
                pos[0] = mid;
                hi = mid - 1;
            }
            else if(nums[mid] < target) {
                lo = mid+1;
            } else{
                hi = mid - 1;
            }
        }
         lo = 0; hi = n-1;
         while(lo<=hi) {
             int mid = lo + (hi-lo) / 2;
             if(nums[mid]==target) {
                 pos[1] = mid;
                 lo = mid + 1;
             }
             else if(nums[mid] > target) {
                 hi = mid - 1;
             } else {
                 lo = mid + 1;
             }
         }
        return pos;
    }

    static void main() {
        int[] arr = {5,7,7,8,8,20};
//        int[] ans = searchRange(arr, 8);
        findLastAndFrist obj = new findLastAndFrist();
        int[]ans = obj.searchRange(arr,8);
        for(int ele:ans) {
            System.out.print(ele+" ");
        }
    }
}
