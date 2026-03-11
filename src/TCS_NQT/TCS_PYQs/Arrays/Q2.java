package TCS_NQT.TCS_PYQs.Arrays;

import java.util.*;
//Input:
//        5, 105 -> N = 5, K=105
//        10 10 40 50 90 -> price of container of each fuel category.
//        10 20 20 50 150 -> volume of container of each fuel Category.
//• Output:
//        170

public class Q2 {
    static int maxVolume(int[] prices, int[] containers, int k){
        int n = prices.length;
        int m = containers.length;
        int i=n-1, j=m-1;
        int sum = 0;
        int maxP = 0;
        while(i>=0 && j>=0){
            if(containers[j] > containers[j-1]){
                if(prices[i] > prices[i-1] && maxP <= k){
                    sum += containers[j];
                    maxP += prices[i];
                }
            }
        }
        return sum;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] price = new int[n];
        for(int i = 0;i < n;i++){
            price[i] = in.nextInt();
        }
        int[] containers = new int[n];
        for(int i = 0;i < n;i++){
            containers[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(maxVolume(price,containers,k));
    }
}
