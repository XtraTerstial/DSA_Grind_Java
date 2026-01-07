package Arrays.Sorting;

public class SelectionSort {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void main() {
        int[] arr = { 5, 4, 3, 2, 1, 7, 8, 6, 5 };
        int n = arr.length;

    }
}
