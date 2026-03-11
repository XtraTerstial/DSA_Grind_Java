package TCS_NQT.Arrays;

public class Q13_ThirdLargest {
    static int thirdLagrest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MAX_VALUE;
        for(int ele : arr){
            if(ele > max){
                thirdMax = secondMax;
                secondMax = max;
                max = ele;
            }
            else if (ele > secondMax) {
                thirdMax = secondMax;
                secondMax = ele;
            }
            else if(ele > thirdMax) thirdMax = ele;
        }
        return thirdMax;
    }
    static void main() {
        int[] arr = {12, 25, 8, 55, 10, 33, 17, 11};
        System.out.println(thirdLagrest(arr));
    }
}
