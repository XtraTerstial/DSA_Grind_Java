package Arrays.Medium;

import java.util.HashMap;

public class Q1_Two_Sum {
    static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compliment = target - arr[i];
            if(map.containsKey(compliment)){
                return new int[] {compliment,arr[i]};
            }
            else{
                map.put(arr[i],i);
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;
        int[] ans = twoSum(arr,target);
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
