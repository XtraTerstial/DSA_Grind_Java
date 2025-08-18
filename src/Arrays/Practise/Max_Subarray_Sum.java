package Arrays.Practise;

import java.util.HashMap;
import java.util.Map;

public class Max_Subarray_Sum {
    static int maxSubarray(int[] arr,int t){
        int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        for (int ele:arr){
            if(ele==t) count++;
            int rem = ele-t;
            if(map.containsKey(rem)) count += map.get(rem);
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 6;
        System.out.println(maxSubarray(arr,target));
    }
}
