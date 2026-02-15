package Arrays.Easy;

public class Q19_FindMissingNumber {
    static void main() {
        int[] arr = {8,4,5,9,2,3,1,6};
        System.out.println(findMissing(arr));
    }

    private static int findMissing(int[] arr) {
        int n = arr.length+1;
        int sum = 0;
        for(int ele:arr){
            sum += ele;
        }
        System.out.println(sum);
        int wholeSum = n * (n+1) / 2;
        return wholeSum-sum;
    }
}
