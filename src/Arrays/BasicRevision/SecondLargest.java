package Arrays.BasicRevision;

public class SecondLargest {
    static int secondLargest(int[] arr){ //Two Pass Solution
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max) max = arr[i];
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] > secondMax && arr[i] < max)
                secondMax = arr[i];
        }
        return secondMax;
    }
    static int secondLargestTwo(int[] arr){ //One Pass Solution Optimizedgit
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int ele:arr){
            if(ele>max){
                secondMax = max;
                max = ele;
            }
            else if(ele > secondMax && ele != max){
                secondMax = ele;
            }
        }
        return secondMax;
    }
    static void main() {
        int[] arr = {2,4,6,9,7,10};
        System.out.println("2nd Largest Element = "+secondLargestTwo(arr));
    }
}
