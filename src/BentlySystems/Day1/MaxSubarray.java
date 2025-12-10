package BentlySystems.Day1;

public class MaxSubarray {
    public static int maxSumSubarray(int[] arr) {
        int n = arr.length;
        int currentSum = 0;
        int ansStart = 0, ansEnd = 0;
        int start = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(currentSum == 0) start = i;
            currentSum += arr[i];

            if(max < currentSum) {
                ansEnd = i;
                ansStart = start;
                max = currentSum;
            }

            if(currentSum < 0) currentSum = 0;
        }
        int len = ansEnd - ansStart + 1;
        int[] ans = new int[len];
        for (int i = ansStart; i <= ansEnd; i++) {
            ans[i-ansStart] = arr[i];
        }
        return len;
    }

    static void main() {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] ans = maxSumSubarray(arr);
//        for (int ele:ans) {
//            System.out.print(ele+" ");
//        }
        System.out.println(maxSumSubarray(arr));
    }
}
