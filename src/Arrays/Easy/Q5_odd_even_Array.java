package Arrays.Easy;

public class Q5_odd_even_Array {
    static void print(int[] a){
        for (int ele:a){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int evenSize=0, oddSize=0;
        for(int ele:arr) {
        if(ele%2==0) evenSize++;
        else oddSize++;
        }
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];
        int j=0,k=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0){
                even[j] = arr[i];
                j++;
            }
            else {
                odd[k] = arr[i];
                k++;
            }
        }
        print(even);
        System.out.println();
        print(odd);
    }
}
