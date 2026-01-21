package Algorithms.Recusrion.Practise_Easy;

import java.util.Scanner;

public class P7_PrintArray {
    static void printArray(int n, int[] arr){
        if(n==1){
            System.out.print(arr[0]+" ");
            return;
        }
        printArray(n-1,arr);
        System.out.print(arr[n-1]+" ");
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        printArray(arr.length, arr);

    }
}
