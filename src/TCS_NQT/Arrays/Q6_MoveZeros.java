package TCS_NQT.Arrays;

public class Q6_MoveZeros {
    static void moveZeroBack(int[] arr){
        int left = 0;
        for(int right = 0; right < arr.length; right++){
            if(arr[right]!=0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
    }
    static void moveZeroFront(int[] arr){
        int right = arr.length-1;
        for(int left = arr.length-1; left >= 0; left--){
            if(arr[left]!=0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                right--;
            }
        }
    }
    static void main() {
        int[] arr = {0,2,0,4,0,3,0,2,0,6};
        moveZeroBack(arr);
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        moveZeroFront(arr);
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
