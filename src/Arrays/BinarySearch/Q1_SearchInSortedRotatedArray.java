package Arrays.BinarySearch;

public class Q1_SearchInSortedRotatedArray {
    static int search(int[] arr, int x){
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = lo + (hi-lo) / 2;
            if(arr[mid] == x) return mid;
            if (arr[lo] < arr[mid]) {
                if(arr[lo]<=x && x<=arr[mid]){
                    hi = mid-1;
                }else{
                    lo = mid + 1;
                }
            }
            else{
                if(arr[mid] <= x && x <= arr[hi]){
                    lo = mid+1;
                }
                else{
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
    static void main() {
        int[] arr = {4,5,6,7,0,1,2};
        int x = 0;
        System.out.println(search(arr,x));
    }
}
