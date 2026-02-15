package Arrays.Easy;

public class Q16_RotateArrayByKplaces {
    static void reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    static void leftRotate(int[] nums, int k){
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);
    }

    static void rightRotate(int[] nums, int k){
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    static void main() {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        leftRotate(arr,k);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] arr1 = {1,2,3,4,5,6,7};
        rightRotate(arr1,k);
        for(int ele:arr1){
            System.out.print(ele+" ");
        }
    }
}
