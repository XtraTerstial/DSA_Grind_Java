package TCS_NQT.Arrays;

import java.util.*;

public class Q7_ContainsDuplicate {
    static boolean dupliCheck(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int ele:arr){
            if(set.contains(ele)){
                return true;
            }
            set.add(ele);
        }
        return false;
    }
    static void main() {
        int[] arr = {1,2,3,4};
        System.out.println(dupliCheck(arr));
    }
}
