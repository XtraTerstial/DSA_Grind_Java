package CodingQuestions.Arrays;

public class FirstAndLastOccurance {
    static int[] firstAndLastOccu(int[] arr, int target){
        int first = -1, last = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                if(first == -1) first = i;
                last = i;
            }
        }
        return new int[]{first, last};
    }
    public static void main() {
        int[] arr = {1,2,0,0,0,0,3,4,5,6};
        int target = 0;
        int[] ans = firstAndLastOccu(arr, target);
        System.out.println("First occu : "+ans[0]);
        System.out.println("Last occu : "+ans[1]);
    }
}
