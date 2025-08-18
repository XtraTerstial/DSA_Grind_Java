package Arrays.Hard;

import Arrays.Medium.Two_D_Array.Print;

import java.util.Arrays;

public class Q8_FindRepeatingAndMissingNumber {
    static int[] bruteForce(int[] arr){
        Arrays.sort(arr);
        // 1 2 3 4 5 5 6 7
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == i+1) continue;
            else{
                return new int[] {arr[i], i+1};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Print p1 = new Print();
        int[] arr = {3,1,2,5,4,6,7,5};
        int[] ans = bruteForce(arr);
        p1.printArray(ans);
    }
}
