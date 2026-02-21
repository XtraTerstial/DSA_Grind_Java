package TCS_NQT.Arrays;

import java.util.*;

//O(n) -> T.C, 0(1)->S.C
public class Q8_FindDuplicates {
    static ArrayList<Integer> findDuplis(int[] arr){
        ArrayList<Integer> dupes = new ArrayList<>();
        Map<Integer,Integer> feqMap = new HashMap<>();
        for(int ele:arr){
            feqMap.put(ele, feqMap.getOrDefault(ele,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: feqMap.entrySet()){
            if(entry.getValue() > 1){
                dupes.add(entry.getKey());
            }
        }
        if(dupes.isEmpty()) dupes.add(-1);
        return dupes;
    }
    static ArrayList<Integer> dupes(int[] arr){
        ArrayList<Integer> freq = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int index = Math.abs(arr[i])-1;

            if(arr[index] < 0){
                freq.add(Math.abs(arr[i]));
                arr[index] = 0;   // Prevent adding again
            }else {
                arr[index] = -arr[index];
            }
        }
        if(freq.isEmpty()) freq.add(-1);
        freq.sort((a,b)->a.compareTo(b));
//        Collections.sort(freq);
        return freq;
    }
    static void main() {
        int[] arr = {2, 3, 1, 6, 3, 6, 1};
        ArrayList<Integer> ans = dupes(arr);
        System.out.println(ans);
    }
}
