package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class Q7_Array_Leader {
    private static ArrayList<Integer> arrayLeader(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);
        int leader = arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            if(arr[i]>arr[i+1] && arr[i]>leader){
                list.add(arr[i]);
                leader = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {12,13,4,3,7,5,1,2};
        ArrayList<Integer> ans = arrayLeader(arr);
        System.out.println(ans);
    }



}
