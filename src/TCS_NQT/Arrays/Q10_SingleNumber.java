package TCS_NQT.Arrays;

public class Q10_SingleNumber {
    static int single(int[] arr){
        int xor = 0;
        for(int ele:arr){
            xor = xor^ele;
        }
        return xor;
    }
    static void main() {
        int[] arr = {1,2,3,1,3,2,4,5,6,5,4};
        System.out.println(single(arr));
    }
}
