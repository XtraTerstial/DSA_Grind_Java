package BentlySystems.Day1;

import java.util.*;

public class ContainsDuplicate {
    static void main() {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] arr){
        Set<Integer> seen = new HashSet<>();
        for(int ele:arr) {
            if(!seen.contains(ele))
                seen.add(ele);
            else return true;
        }
        return false;
    }
}
