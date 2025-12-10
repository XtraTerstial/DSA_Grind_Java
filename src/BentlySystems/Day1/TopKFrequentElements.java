package BentlySystems.Day1;
import java.util.*;
public class TopKFrequentElements {
    public int[] topKfrequent(int[] nums, int k) {

        //Map to store frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int n:nums){
            freqMap.put(n, freqMap.getOrDefault(n,0)+1);
        }

        //        Create a “bucket” array
        List<Integer>[] bucket = new List[nums.length+1];
        //storing in the bucket array
        for (int key:freqMap.keySet()) {
            int frequency = freqMap.get(key);
            if(bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        //collect the top K frequent elements
        int[] res = new int[k];
        int counter = 0;

        for(int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            if(bucket[pos] != null) {
                for(Integer integer:bucket[pos]) {
                    res[counter++] = integer;
                }
            }
        }
        return res;
    }
}
