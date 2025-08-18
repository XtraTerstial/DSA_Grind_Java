package Arrays.BasicRevision;

import Arrays.Medium.Two_D_Array.Print;

public class Reverse {
    static void reverse(int[] arr){
        int n = arr.length;
        int i=0, j =n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public static void main(String[] args) {
        Print p1 = new Print();
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        p1.printArray(arr);
    }
}
