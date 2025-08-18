package Arrays.Easy;

import java.util.*;

public class Q9_Find_UniqueAndDuplicates {
    static List<Integer> countUnique(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }
            List<Integer> ans = new ArrayList<>();
        for (Integer ele : set) {
            ans.add(ele);
        }
        return ans;
    }
    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> ans = (ArrayList<Integer>) countUnique(arr);
        System.out.println(ans);
        ArrayList<Integer> ans2 = (ArrayList<Integer>) findDuplicates(arr);
        System.out.println(ans2);
     }
}
