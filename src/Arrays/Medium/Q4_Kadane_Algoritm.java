package Arrays.Medium;
//Maximum and Minimum subArray Sum
public class Q4_Kadane_Algoritm {
    static int[] maxSum(int[] arr){
        int n = arr.length;
        int currentSum = 0;
        int ansStart = -1, ansEnd = 1;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int maxSubarrayLen = 0;
        for (int i = 0; i <n ; i++) {
            if(currentSum==0) start = i;
            currentSum += arr[i];
//            max = Math.max(currentSum,max);
            if(max < currentSum){
                ansEnd = i;
                ansStart = start;
                max = currentSum;
            }
//            maxSubarrayLen = Math.max(maxSubarrayLen, ansEnd-ansStart+1);
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        int[] ans = new int[ansEnd-ansStart+1];
        for (int i = ansStart; i <= ansEnd; i++) {
            ans[i-ansStart] = arr[i];
        }
        return  ans;
    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int[] ans = maxSum(arr);
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
