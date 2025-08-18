package Arrays.Easy;

import java.util.Scanner;

public class Q1_Print_Each_element_with_index {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of elements in the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" is at index: "+i);
        }

    }
}
