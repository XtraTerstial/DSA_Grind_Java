package Arrays.Practise;

public class NextPermutation {
    static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr, int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++; end--;
        }
    }
    static void nextPermutation(int[] arr){
        int n = arr.length;
        int index = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr,0,n-1);
            return;
        }

        for (int i = n-1; i > index ; i--) {
            if(arr[i] > arr[index]){
                swap(arr,i,index);
                break;
            }
        }
        reverse(arr,index+1,n-1);
    }
    static void nextPermutation2(int[] arr){
        int index = -1, n = arr.length;

        for(int i=n-2 ; i>=0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr, 0, n-1);
            return;
        }
        for(int i=n-1; i>=0;i--){
            if(arr[i] > arr[index]){
                swap(arr, i, index);
                break;
            }
        }
        reverse(arr, index+1, n-1);

    }
    static void main() {
        int[] arr = {2,1,5,4,3,0,0};
        nextPermutation(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
