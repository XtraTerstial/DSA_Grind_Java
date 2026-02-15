package Arrays.Practise;

public class MaxSumSubArray {
    static int[] maxSum(int[] nums){
        int n = nums.length;
        int ansStart = 0, ansEnd = 0;
        int currentSum = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if(currentSum == 0) start = i;
            currentSum += nums[i];
            if(max < currentSum){
                ansStart = start;
                ansEnd = i;
                max = currentSum;
            }

            if(currentSum < 0) currentSum = 0;
        }

        int[] ans = new int[ansEnd-ansStart+1];
        for (int i = ansStart; i <= ansEnd; i++) {
            ans[i-ansStart] = nums[i];
        }
        return ans;
    }
    static void main() {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int[] ans = maxSum(arr);
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
