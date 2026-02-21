package Arrays.Sorting;

public class BubbleSort {
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
//        for (int j = 0; j < n-1 ; j++) {
//            for (int i = 0; i < n - 1 - j; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    swap(arr, i, i + 1);
//                }
//            }
//            boolean flag = true;
//            for (int i = 0; i < n-1-j; i++) {
//                if(arr[i]>arr[i+1]){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag==true) break;
//        }
        for(int x = 0; x < n - 1; x++){
            boolean flag = true;
            for(int i = 0; i < n - 1 - x; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                    flag = false;
                }
            }
            if(flag)break;
        }
        print(arr);
    }
}
