package Arrays.Easy;

public class Q13_Max_Ones {
    static int maxOnes(int[] arr){
        int count = 0;
        int max = 0;
        for(int ele:arr){
            if(ele == 1){
                count++;
            }
            else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        return Math.max(count,max);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,1,1,1,1};
        int count = maxOnes(arr);
        System.out.println(count);
    }
}
