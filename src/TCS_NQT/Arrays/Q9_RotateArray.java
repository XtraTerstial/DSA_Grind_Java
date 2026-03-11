package TCS_NQT.Arrays;

import java.util.Scanner;

public class Q9_RotateArray {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void arrayReverse(int[] arr, int i, int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    static void rightRotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        arrayReverse(arr, 0, n-1);
        arrayReverse(arr, 0, k-1);
        arrayReverse(arr, k, n-1);
    }
    static void leftRotate(int[] arr, int k){
        int n = arr.length;
        k=k%n;
        arrayReverse(arr, 0, k-1);
        arrayReverse(arr, k, n-1);
        arrayReverse(arr, 0, n-1);
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        int k = in.nextInt();
        rightRotate(arr, k);
        print(arr);
    }
}
