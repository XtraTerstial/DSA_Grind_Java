package Arrays.Medium;
import java.util.*;
public class Q9_Longest_Consecutive_SubSeq {
    static int longestSub(int[] arr){
        int n = arr.length;
        if(n==0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }
        int max = 1;
        for(int ele:arr){
            if(!set.contains(ele-1)){
                int count = 1;
                int x = ele;
                while(set.contains(x+1)){
                    x += 1;
                    count+=1;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {100,200,1,2,3,4}; // -> 1,2,3,4 = 4
//        int[] arr = {3, 8, 5, 7, 6}; // -> 5,6,7,8 = 4
        System.out.println(longestSub(arr));
    }
}
