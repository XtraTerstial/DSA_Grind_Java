package CodingQuestions.Arrays;

public class Q30_MoveZerosAndOnes {
    static void moveZerosBack(int[] arr) {
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
    }

    static void moveZerosFront(int[] arr) {
        int n = arr.length;
        int right = n-1;
        for (int left = n-1; left >=0 ; left--) {
            if(arr[left] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }

    static void main(String[] args) {
        int[] bit = {1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0};
        moveZerosFront(bit);
        for (int ele : bit) {
            System.out.print(ele + " ");
        }
    }
}
