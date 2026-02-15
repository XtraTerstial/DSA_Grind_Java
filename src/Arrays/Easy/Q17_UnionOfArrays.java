package Arrays.Easy;

import java.util.ArrayList;

public class Q17_UnionOfArrays {
    static ArrayList<Integer> unionOfTwoArrays(int[] arr1, int[] arr2){
        int n = arr1.length, m = arr2.length;
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }
            if(arr2[j] < arr1[i]){
                if(union.isEmpty() || union.get(union.size()-1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
            else{
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }
        }
        while(i<n){
            if(union.isEmpty() || union.get(union.size()-1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while(j<m){
            if(union.isEmpty() || union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        return union;
    }
    static void main() {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8,9};
        ArrayList<Integer> union = unionOfTwoArrays(arr1, arr2);
        System.out.println(union);
    }
}
