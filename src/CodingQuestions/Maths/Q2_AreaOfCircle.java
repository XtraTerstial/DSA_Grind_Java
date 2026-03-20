package CodingQuestions.Maths;
// 2
import java.util.Scanner;

public class Q2_AreaOfCircle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int diameter = in.nextInt();
        double radius = (double) diameter/2;
        double pi = 3.14;
        double area =  Math.PI * radius*radius;
        System.out.println("Area of Circle with diameter "+diameter+" is " +area);
    }
}
