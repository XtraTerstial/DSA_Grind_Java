package Arrays.Sorting.problems;
//LeetCode - 493
// i < j && arr[i]>2*arr[j]
public class Reverse_Pairs {
    static int count = 0;
    static void print(int[] nums){
        for (int ele:nums){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void inversionCount(int[] a, int[]b){
        int i=0, j=0;
        while(i< a.length && j< b.length){ //if((long)a[i] > ((long)2*(long)b[j])){ -> in LeetCode typecast to long
            if(a[i]>2*b[j]){
                count += (a.length-i);
                j++;
            }
            else i++;
        }
    }
    static void mergeTwoSortedArrays(int[] a, int[] b, int[] result){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i] > 2*b[j]){
                result[k++] = a[i++];
            }
            else{
//                count += (a.length-i); **if you don't want to make inversion count method then use this
                result[k++] = b[j++];
            }
        }
        while(i<a.length) result[k++] = a[i++];
        while(j<b.length) result[k++] = b[j++];
    }
    static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n-n/2; i++) {
            b[i] = arr[i+n/2];
        }
        mergeSort(a);
        mergeSort(b);
        inversionCount(a,b);
        mergeTwoSortedArrays(a, b, arr);

    }
    static void main() {
        int[] arr = {2, 4, 1, 3, 5};
        print(arr);
        mergeSort(arr);
        print(arr);
        System.out.println("Inversion Count = " +count);
    }
}
