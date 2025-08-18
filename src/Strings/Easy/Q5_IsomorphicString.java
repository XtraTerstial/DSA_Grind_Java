package Strings.Easy;
import java.util.*;
public class Q5_IsomorphicString {
    static boolean checkIsomorphic(String s, String t){
        if(s.length()!=t.length()) return false;
        Map<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original,replacement);
                }else{
                    return false;
                }
            }
            else{
                char mappedChar = map.get(original);
                if(mappedChar != replacement) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg", t = "aed";
        boolean flag = checkIsomorphic(s,t);
        System.out.println(flag);
    }
}
