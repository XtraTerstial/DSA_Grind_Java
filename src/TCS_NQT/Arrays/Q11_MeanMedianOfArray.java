package TCS_NQT.Arrays;

public class Q11_MeanMedianOfArray {
    static double mean(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int ele:arr){
           sum += ele;
        }
        return (double)sum/ arr.length;
    }
    static double median(int[] arr){
        int n = arr.length;
        if(n%2==0){
            return (arr[n/2] + arr[n/2-1]) / 2.0;
        }
        return arr[n/2];
    }
    static void main() {
        int[] arr = {1, 2, 19, 28, 5};

    }
}
