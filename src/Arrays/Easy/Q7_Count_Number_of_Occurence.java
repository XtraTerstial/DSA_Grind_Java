package Arrays.Easy;

public class Q7_Count_Number_of_Occurence {
    static int lowerBound(int[] arr, int target){
        int lo=0,hi=arr.length-1;
        int res = 0;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] >= target){
                res = mid;
                hi = mid-1;
            }
            else lo=mid+1;
        }
        return res;
    }
    static int upperBound(int[] arr, int target){
        int lo=0,hi=arr.length-1;
        int res = 0;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] > target){
                res = mid;
                hi = mid-1;
            }
            else lo=mid+1;
        }
        return res;
    }
    static int countOccurnce(int[] arr,int target){
        return upperBound(arr,target) - lowerBound(arr,target);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3,3,4};
        int target = 2;
        System.out.println(countOccurnce(arr,target));
    }
}
