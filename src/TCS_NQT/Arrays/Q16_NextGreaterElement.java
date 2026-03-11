package TCS_NQT.Arrays;

import java.util.*;

public class Q16_NextGreaterElement {
    static int[] nextGreaterElement(int[] nums1, int[] nums2){
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele:nums2){
            while(!st.isEmpty() && ele > st.peek()){
                int prev = st.pop();
                map.put(prev, ele);
            }
            st.push(ele);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
    static void main() {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] ans = nextGreaterElement(nums1, nums2);
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
