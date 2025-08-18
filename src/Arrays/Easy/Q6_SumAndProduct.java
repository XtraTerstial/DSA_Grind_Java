package Arrays.Easy;

public class Q6_SumAndProduct {
    static void add(int[] arr){
        int sum=0;
        for(int ele:arr){
            sum+=ele;
        }
        System.out.println("Sum of Array is: "+sum);
    }
    static void product(int[] arr){
        int prod = 1;
        for (int ele:arr){
            prod *= ele;
        }
        System.out.println("Product of Array is: "+prod);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        add(arr);
        product(arr);
    }
}
