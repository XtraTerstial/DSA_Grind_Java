package Arrays.Sorting;

public class MergeSort {
    static void print(int[] nums){
        for (int ele:nums){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void mergeTwoSortedArrays( int[] arr1,int[] arr2, int[] result){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i=0, j=0, k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]) result[k++] = arr1[i++];
            else result[k++] = arr2[j++];
        }
        while(i<n1) result[k++] = arr1[i++];
        while(j<n2) result[k++] = arr2[j++];
    }
    static void mergeSort(int[] arr){
        int n= arr.length;
        if(n==1) return; //base case
        //create two array of size n/2
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n-n/2; i++) {
            b[i] = arr[i+n/2];
        }
        //magic
        mergeSort(a);
        mergeSort(b);
        mergeTwoSortedArrays(a,b,arr);
    }
    static void main() {
        int[] arr = {5, 4, 3, 2, 1, 7, 8, 6, 5};
        print(arr);
        mergeSort(arr);
        print(arr);
    }
}
