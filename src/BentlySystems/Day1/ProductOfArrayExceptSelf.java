package BentlySystems.Day1;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
//        product[0] = nums[0];
        for (int i = 0; i < n; i++) {
            product *= nums[i];
        }
        int[] prodarr = new int[n];
        for(int i=0;i<n;i++) {
            prodarr[i] = product / nums[i];
        }
        return prodarr;
    }
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        int[] suffix = new int[n];
        suffix[n-1] = 1;
        for (int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for (int i = 0; i < n; i++) {
            prefix[i] *= suffix[i];
        }
        return prefix;
    }

    static void main() {
        int[] arr = {-1,1,0,-3,3};
        int[] prod = productExceptSelf2(arr);
        for (int ele:prod) {
            System.out.print(ele +" ");
        }
    }
}
