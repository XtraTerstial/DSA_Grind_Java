package TCS_NQT.Arrays;

import java.util.*;

public class Q14_SortElementsByFrequency {
    static ArrayList<Integer> sortByFreq(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele:arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
            list.add(ele);
        }
        list.sort((a,b)->{
            int freqCompare = Integer.compare(map.get(b), map.get(a));
            // descending frequency

            if(freqCompare == 0){
                return Integer.compare(a,b);  // ascending value
            }

            return freqCompare;
        });
        return list;
    }
    static void main() {
        int[] arr = {9,9,9,2,5};
        ArrayList<Integer> list = sortByFreq(arr);
        System.out.println(list);
    }
}
