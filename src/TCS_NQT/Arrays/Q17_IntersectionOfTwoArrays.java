package TCS_NQT.Arrays;

import java.util.*;

public class Q17_IntersectionOfTwoArrays {
    static int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num : nums1){
            set.add(num);
        }

        for(int num : nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        return result.stream().mapToInt(x->x).toArray();
    }
    static void main() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

    }
}
