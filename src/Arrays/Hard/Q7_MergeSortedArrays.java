package Arrays.Hard;

import Arrays.Medium.Two_D_Array.Print;

public class Q7_MergeSortedArrays {
    static void mergeSortedArrays(int[]nums1, int m, int[]nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = (m+n)-1;
        while(j>=0){
            if(k>=0 && nums1[i]<nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
    public static void main(String[] args) {
        Print p1 = new Print();
            int m = 4;
            int n = 4;
            int[] arr = new int[m + n];
            arr[0] = 1;
            arr[1] = 3;
            arr[2] = 5;
            arr[3] = 8;

            int[] arr2 = {2, 4, 6, 7};

            mergeSortedArrays(arr,m,arr2,n);
            p1.printArray(arr);
        }
}
