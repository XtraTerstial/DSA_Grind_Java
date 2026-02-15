package Arrays.Easy;

public class Q12_MoveZeros {
    static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    static void moveBack(int[] arr){
        int left = 0;
        for(int right = 0;right<arr.length;right++){
            if(arr[right]!=0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
    }
    static void moveZerosFront(int[] arr) {
        int n = arr.length;
        int right = n-1;
        for (int left = n-1; left >=0 ; left--) {
            if(arr[left] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 20, 4, 3, 0, 0, 5};
        System.out.println("0's at front :-");
        moveZerosFront(arr);
        print(arr);
        System.out.println();
        System.out.println("0's at back:-");
        moveBack(arr);
        print(arr);

    }
}
