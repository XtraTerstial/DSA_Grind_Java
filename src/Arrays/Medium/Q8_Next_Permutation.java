package Arrays.Medium;

public class Q8_Next_Permutation {
    static void nextPermutation(int[] arr){
        int n = arr.length;
        int index = -1;
        //Find breakpoint first
        for (int i = n-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        // if no breakpoint reverse the array and done
        if(index == -1){
            reverse(arr, 0, n-1);
            return;
        }

        // if found swap it with a number just bigger than it
        for (int i = n-1; i > index; i--) {
            if(arr[i] > arr[index]){
                swap(arr, i, index);
                break;
            }
        }
        // reverse the remaining array
        reverse(arr, index+1, n-1);
    }
    static void reverse(int[]arr, int start, int end){
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void main() {
        int[] arr = {2,1,5,4,3,0,0};
        nextPermutation(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
