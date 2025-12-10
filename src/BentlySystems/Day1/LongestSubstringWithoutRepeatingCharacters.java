package BentlySystems.Day1;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            if(map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) +1;
            }
            map.put(ch, right);
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
