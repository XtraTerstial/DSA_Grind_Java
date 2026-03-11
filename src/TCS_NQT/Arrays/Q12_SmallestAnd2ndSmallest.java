package TCS_NQT.Arrays;

public class Q12_SmallestAnd2ndSmallest {
    static int[] smallAndSecondSmall(int[] arr){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int ele:arr){
            if(ele < min) min = ele;
            if(ele < secondMin && ele > min) secondMin = ele;
        }
        return new int[] {min, secondMin};
    }
    static void main() {
        int[] arr = {12, 25, 8, 55, 10, 33, 17, 11};
        int[] ans = smallAndSecondSmall(smallAndSecondSmall(arr));
        System.out.println("Min : " + ans[0] );
        System.out.println("Second Min : " + ans[1] );
    }
}
