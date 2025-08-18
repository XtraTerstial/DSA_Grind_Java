package Arrays.Hard;

import java.util.*;

public class Q3_4Sum {
    static List<List<Integer>> fourSum(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;

            for (int j = i+1; j <n-2 ; j++) {
                if (j>i+1 && arr[j]==arr[j-1]) continue;
                int left = j+1, right = n-1;
                while(left<right){
                    long sum =(long) arr[i] + arr[j] + arr[left] + arr[right] ;
                    if(sum == 0) {
                        list.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));

                        while(left<right && arr[left]==arr[left+1]) left++;
                        while(left<right && arr[right]==arr[right-1]) right--;

                        left++; right--;
                    }
                    else if(sum>0) right--;
                    else left++;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        List<List<Integer>> list = fourSum(arr);
        System.out.println(list);
    }
}
