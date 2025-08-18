package Arrays.Practise;

public class SortColors {
    static void sortColor(int[] arr){
        int n = arr.length;
        int lo=0, mid =0;
        int hi=n-1;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;mid++;
            }
            else if(arr[mid]==1) mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,2,2,2,1,1,0,0,0,2,1};
        sortColor(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
