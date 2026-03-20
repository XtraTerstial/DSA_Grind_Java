package TCS_NQT.TCS_PYQs;
import java.util.*;
public class intelligence_agency {
    static int digitSum(int n){
        int temp = n;
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        if(r == 0){
            System.out.println("0");
        }
        else {
            int rSum = r * digitSum(n);
            int sum = 0;
            while (true) {


                while (rSum > 0) {
                    sum += rSum % 10;
                    rSum /= 10;
                }
                if (sum / 10 == 0) {
                    break;
                } else {
                    rSum = sum;
                }
            }
            System.out.println(sum);
        }
    }
}
