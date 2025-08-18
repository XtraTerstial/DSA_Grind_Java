package Arrays.Easy;
// duplicate element should appear in even freq
// else use Hash Table
public class Q14_Find_Single_Number {
    public static void main(String[] args) {
        int[] arr = {4,1,1,2,2,2,2,3,3};
        int n = single(arr);
        System.out.println(n);
    }

    private static int single(int[] arr) {
        int xor = 0;
        for (int ele:arr){
            xor = xor^ele;
        }
        return xor;
    }
}
