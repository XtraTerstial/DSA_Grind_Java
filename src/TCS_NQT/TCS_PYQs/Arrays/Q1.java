package TCS_NQT.TCS_PYQs.Arrays;

import java.util.*;

//21 12 13 -21 -2
public class Q1 {
    static int fairSequence(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int t=1;
        if(arr[0] > 0) t=0;
        int i = 0;
        int count=0;
        while(i<n){
            if(t==0){
                int j=i;

                while(j<n){
                    if(arr[j]>0){
                        j++;
                    }else{
                        break;
                    }
                }
                int max = arr[i];
                for (int k = i; k < j; k++) {
                    max = Math.max(max, arr[k]);
                }
                ans.add(max);
                i=j;
                t=1;
            }
            else{
                int j = i;

                while(j<n){
                    if(arr[j]<0){
                        j++;
                    }else{
                        break;
                    }
                }
                int max = arr[i];
                for (int k = i; k < j; k++) {
                    max = Math.max(max, arr[k]);
                }
                ans.add(max);
                i=j;
                t=0;
            }
        }
        int sum = 0;
        for(int ele:ans){
            sum += ele;
        }
        return sum;
    }
    static void main() {
        Scanner in = new Scanner(System.in);
        int[] arr = {-1, 18, 13, 18, 2, 16,-1, -213, 11};
        System.out.println(fairSequence(arr));
    }
}

