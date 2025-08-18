package Arrays.Easy;

public class Q4_CreateDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] dupe = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            dupe[i] = arr[i];
        }
        for (int ele:dupe){
            System.out.print(ele+" ");
        }
    }
}
