package BentlySystems.Day1;
import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> group(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String str:strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(!map.containsKey(sorted)){
                map.put(sorted, new LinkedList<String>());
            }
            map.get(sorted).add(str);
        }
        return new LinkedList<>(map.values());
    }
}
