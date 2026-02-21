package Arrays.Sorting;

import static java.lang.Long.MAX_VALUE;

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
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        print(arr);
    }
}
