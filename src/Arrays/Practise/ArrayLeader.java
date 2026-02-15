package Arrays.Practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLeader {
    static ArrayList<Integer> leader(int[] arr){
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        int lead = arr[n-1];
        leaders.add(lead);
        for(int i = n-2; i >= 0; i--){
            if(arr[i] > lead){
                lead = arr[i];
                leaders.add(lead);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
    static void main() {
        int[] arr = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> leaders = leader(arr);
        System.out.println(leaders);
    }
}
