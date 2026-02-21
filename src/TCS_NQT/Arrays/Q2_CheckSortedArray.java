package TCS_NQT.Arrays;

public class Q2_CheckSortedArray {
    static boolean check(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    static void main() {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(check(arr));
    }
}
