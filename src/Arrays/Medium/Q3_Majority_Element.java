package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

//Mojority element is the element which appear more than n/2 times
public class Q3_Majority_Element {
    static int majorityEle(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele:arr){
            if(map.get(ele)>n/2);
            return ele;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityEle(arr));
    }
}
