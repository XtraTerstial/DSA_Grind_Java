package Arrays.Sorting.problems;

public class MergeTwoSortedArrays {
    static void print(int[] nums){
        for (int ele:nums){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static int[] mergeTwoSortedArrays( int[] arr1,int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1+n2];
        int i=0, j=0, k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while(i<n1){
            result[k++] = arr1[i++];
        }
        while(j<n2){
            result[k++] = arr2[j++];
        }
        return result;
    }
    static void main() {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] ans = mergeTwoSortedArrays(arr1, arr2);

        print(ans);

    }
}
