package TCS_NQT.Arrays;

import java.util.*;

public class Q5_CountFreq {
    static ArrayList<ArrayList<Integer>> countFreq(int[] arr){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele:arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            list.add(temp);
        }
        list.sort((a,b)-> Integer.compare(a.get(0), b.get(0)));
        return list;
    }
    static void main() {
        int[] arr = {10, 20, 10, 5, 20};
        ArrayList<ArrayList<Integer>> list = countFreq(arr);
        System.out.println(list);
    }
}
