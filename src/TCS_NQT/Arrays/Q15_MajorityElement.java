package TCS_NQT.Arrays;

import java.util.HashMap;
import java.util.Map;
//Boyer-Moore voting algorithm
public class Q15_MajorityElement {
    static int majority(int[] arr){
        int count = 0, ele = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(count == 0) {
                ele = arr[i];
                count = 1;
            }
            else if(ele == arr[i]){
                count ++;
            }else{
                count--;
            }
        }
        int cnt1 = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == ele) cnt1++;
        }
        if(cnt1 > n/2) return ele;
        return -1;
    }
    static int majorityPractise(int[] arr){
        int n = arr.length;
        int count = 0, ele = 0;

        for (int i = 0; i < n; i++) {
            if(count==0){
                ele = arr[i];
                count = 1;
            }else if(ele == arr[i]){
                count++;
            }else{
                count--;
            }
        }
        int cnt1=0;
        for(int num:arr){
            if(num == ele) cnt1++;
        }
        if(cnt1 > n/2)
            return ele;
        return -1;
    }
    static void main() {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityPractise(arr));
    }
}
