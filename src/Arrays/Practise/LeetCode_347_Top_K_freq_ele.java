package Arrays.Practise;

import Arrays.Medium.Two_D_Array.Print;

import java.util.*;

public class LeetCode_347_Top_K_freq_ele {
    static int[] getFrequent(int[] arr, int k){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey()>=k){
                list.add(entry.getValue());
            }
        }
        Collections.reverse(list);
        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
    public static void main(String[] args) {
        Print p = new Print();
        int[] arr = {-1,-1};
        int k = 1;
        int[] ans = getFrequent(arr,k);
        p.printArray(ans);
    }
}
