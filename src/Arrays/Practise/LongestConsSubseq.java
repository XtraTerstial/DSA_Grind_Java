package Arrays.Practise;

import java.util.HashSet;
import java.util.Set;

public class LongestConsSubseq {
    static int longestSubseq(int[] nums){
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int max = 0;
        for(int ele:nums){
            if(!set.contains(ele-1)){
                int count = 1;
                int x = ele;
                while(set.contains(x+1)){
                    x+=1;
                    count+=1;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
    static void main() {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
    }
}
