package Arrays.Medium;

public class Max_Product_Subarray {
    static int maxProduct(int[] arr){
        int n = arr.length;
        int maxProd = Integer.MIN_VALUE;
        int prod = 1;
        for (int i = 0; i <n ; i++) {
            prod *= arr[i];
            maxProd = Math.max(prod,maxProd);
            if(prod == 0){
                prod = 1;
            }
        }
        return maxProd;
    }
    public static void main(String[] args) {

        int[] arr = {-3,-1,-1};
        System.out.println(maxProduct(arr));
    }
}
