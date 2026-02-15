package Arrays.Medium;

public class Q5_StockBuyAndSell {
    public static int maxProfit(int[] arr){
        int n = arr.length;
        int maxP = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int ele:arr){
            minValue = Math.min(minValue,ele);
            maxP = Math.max(maxP, ele - minValue);
        }
        return maxP;
    }
    static int maxProfit2(int[] arr){
        int profit = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                profit += arr[i] - arr[i-1];
            }
        }
        return profit;
    }
    static int stockBuyAndSell4(int[] stocks, int t){
        int n = stocks.length;
        int profit = 0;
        int i = 1;
            while(t>0){
                while(i<n) {
                    if (stocks[i] > stocks[i - 1]) {
                        profit += stocks[i] - stocks[i - 1];
                    }
                    i++;
                }
                t--;
            }

        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        //Buy on Day 1 and sell at Day 6 -> profit = 6-1 = 5
        System.out.println(maxProfit(arr));

        //Stock buy and sell 2
        int[] arr1 = {7,1,5,3,6,4};
        System.out.println(maxProfit2(arr1));

        //Stock buy and sell 4
        int[] arr2 = {3,2,6,5,0,3};
        //no of transaction allowed
        int transactions = 2;
        System.out.println(stockBuyAndSell4(arr2, transactions));
    }
}
