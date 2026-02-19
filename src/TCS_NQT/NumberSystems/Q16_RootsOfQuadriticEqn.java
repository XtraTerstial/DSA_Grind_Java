package TCS_NQT.NumberSystems;

import java.util.Scanner;

public class Q16_RootsOfQuadriticEqn {
    static void roots(int a, int b, int c){
        if(a==0){
            throw new ArithmeticException("Roots are imaginary");
        }
        //discriminant
        int d = b*b - 4*a*c;

        if(d < 0){
            throw new RuntimeException("Roots are imaginary");
        }

        int sqrtD = (int)Math.sqrt(d);

        int root1 = (int)Math.floor((-b+sqrtD) * (2.0*a));
        int root2 = (int)Math.floor((-b-sqrtD) * (2.0*a));

        if(root1<root2){
            int temp = root1;
            root1 = root2;
            root2 = temp;
        }
        System.out.println("Roots are "+root1+" ans "+ root2);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        roots(a, b, c);

    }
}
