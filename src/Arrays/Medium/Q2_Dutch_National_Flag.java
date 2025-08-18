package Arrays.Medium;

public class Q2_Dutch_National_Flag {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int[] arr){
        int noOfZ = 0;
        int noOfOne = 0;
        for(int ele:arr){
            if(ele==0) noOfZ++;
            if(ele==1) noOfOne++;
        }
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(i<noOfZ ) arr[i] = 0;
            else if(i<(noOfZ+noOfOne)) arr[i] = 1;
            else arr[i] = 2;
        }
    }
    static void dutchFlag(int[] arr){
        int n = arr.length;
        int lo = 0,mid = 0;
        int hi = n-1;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr,mid,lo);
                lo++;mid++;
            }
            else if(arr[mid] == 1) mid++;
            else{
                swap(arr,mid,hi);
                hi--;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,2,2,2,1,1,0,0,0,2,1};
        dutchFlag(arr);
        for (int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
