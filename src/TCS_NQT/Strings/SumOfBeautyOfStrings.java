package TCS_NQT.Strings;

import java.util.*;

public class SumOfBeautyOfStrings {
    static int sumOfBeauty(String s){
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int[] freq = new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;

                int beauty = maxCount(freq) - minCount(freq);
                sum += beauty;
            }
        }
        return sum;
    }

    private static int minCount(int[] freq) {
        int min = Integer.MAX_VALUE;
        for(int ele:freq){
            if(ele>0)
                min = Math.min(min,ele);
        }
        return min;
    }

    private static int maxCount(int[] freq) {
        int max = Integer.MIN_VALUE;
        for(int ele:freq){
            max = Math.max(max,ele);
        }
        return max;
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        /*
        * input :- aabcbaa
         Output :- 17
        * */
        String s = in.nextLine();
        System.out.println(sumOfBeauty(s));
    }
}
