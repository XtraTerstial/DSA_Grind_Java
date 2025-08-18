package Arrays.Easy;

public class Q8_Check_Sorted_Array {
    static boolean checkAscending(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    static boolean checkDecending(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr1 = {8,7,6,5,4,3,2,1};
        int[] arr2 = {5,99,33,6,2,8,3,8,2,0,1};
        System.out.println(checkAscending(arr2));
        System.out.println(checkDecending(arr2));
    }
}
