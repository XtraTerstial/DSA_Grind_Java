package Arrays.Hard;
//Element in array should appear more than n/3 times
//Extended Moore Voting Algo
/*There can't be more than 2 elements beacuse as told in the question elemnet freq should be(>= n/3)
that's why if 3 have size >= n/3 then it will excced the array's length which is not possible*/

import java.util.*;
public class Q1_Majority_Element_II {
    static List<Integer> majority(int[] arr){
        int n = arr.length;
        int cnt = 0, cnt1 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MAX_VALUE;
        // Identifying the Two Elements
        for (int i = 0; i < n; i++) {
            if(cnt == 0 && ele2 != arr[i]){
                cnt = 1;
                ele1 = arr[i];
            }
            else if(cnt1 == 0 && ele1 != arr[i]){
                cnt1 = 1;
                ele2 = arr[i];
            }
            else if(ele1 == arr[i]) cnt++;
            else if(ele2 == arr[i]) cnt1++;
            else{
                cnt--; cnt1--;
            }
        }
        // Count the size of the elements
        List<Integer> list = new ArrayList<>();
        cnt=0;cnt1=0;
        for(int x:arr){
            if(ele1 == x) cnt++;
            if(ele2 == x) cnt1++;
        }
        // Checking it there freq is more than n/3
        int min = (int)(n/3);
        if(cnt >= min)list.add(ele1);
        if(cnt1 >= min) list.add(ele2);

        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,4,4,4,2,3};
        List<Integer> list =  majority(arr);
        System.out.println(list);
    }
}
