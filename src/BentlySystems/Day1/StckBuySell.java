package BentlySystems.Day1;

public class StckBuySell {
    static void main() {
        int[] arr = {7, 1, 4, 5, 6, 3, 2};
        System.out.println(profit(arr));

    }
    public static int profit(int[] arr){
        int maxProfit = 0;
        int currMin = arr[0];
        for(int ele:arr){
            currMin = Math.min(currMin, ele);
            maxProfit = Math.max(maxProfit, ele - currMin);
        }
        return maxProfit;
    }
}
