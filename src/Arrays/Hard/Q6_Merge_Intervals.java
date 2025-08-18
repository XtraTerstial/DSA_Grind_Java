package Arrays.Hard;
import Arrays.Medium.Two_D_Array.Print;

import java.util.*;
public class Q6_Merge_Intervals {
    static int[][] mergeIntervals(int[][] intervals){
        if(intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);

        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }else{
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        Print p1 = new Print();
        int[][] arr = {{1,3},{8,10},{2,6},{15,18}};
        int[][] ans = mergeIntervals(arr);
        p1.printMatrix(ans);
    }
}
