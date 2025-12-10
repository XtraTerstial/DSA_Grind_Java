package BentlySystems.Day1;

public class SearchInRotatedSortedArray {
    static void main() {
        int[] arr = {2,4,5,6,7,0,1};
        System.out.println(search(arr,2));
    }
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0, hi = n-1;

        while(lo<=hi) {
            int mid = lo+(hi-lo)/2;
            if(nums[mid] == target) return mid;

            if(nums[lo] <= nums[mid]) {
                if(nums[lo]<=target && target <= nums[mid]) {
                    hi = mid - 1;
                }
                else{
                    lo = mid + 1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[hi]) {
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
        }
        return -1;
    }
}
