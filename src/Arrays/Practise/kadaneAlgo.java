package Arrays.Practise;
//Max, Min Subarray sum
public class kadaneAlgo {
    static int[] maxSubarray(int[] nums){
        int n = nums.length;
        int currentSum = 0;
        int start = 0;
        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
        int ansStart = 0, ansEnd = 0;
        for (int i = 0; i < n; i++) {
            if(currentSum == 0) start = i;
            currentSum += nums[i];
            if(max > currentSum){
                ansStart = start;
                ansEnd = i;
                max = currentSum;
            }
            if(currentSum < 0) currentSum = 0;
        }
        int[] ans = new int[ansEnd-ansStart+1];
        for (int i = ansStart; i <= ansEnd ; i++) {
            ans[i-ansStart] = nums[i];
        }
        return ans;
    }
    static void main() {
        int[] arr = {2, 3, 5, -2, 7, -4};
        int[] ans = maxSubarray(arr);
        for (int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
