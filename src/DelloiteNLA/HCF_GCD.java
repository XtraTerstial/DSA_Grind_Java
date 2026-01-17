package DelloiteNLA;

public class HCF_GCD {
    public static int gcd(int a, int b){ //T.C -> O(max(a,b))
        if(a==0) return b;
        if(b==0) return a;
        if(a==b) return a;
        if(a>b)
            return gcd((a-b), b);
        return gcd(b-a, a);
    }
    public static int gcd1(int a, int b){ //T.C -> O(log min(a,b))
        if(b==0) return a;
        return gcd(b, a%b);
    }
    //      ** PREFERABLE FOR PLACEMENT STANDPOINT **
    public static int gcd2(int a, int b){ //T.C -> O(log min(a,b))
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[]){
        int a = 12, b= 18;
        System.out.println("HCF/GCD of "+a+" & "+b+" is = "+gcd2(a,b));
    }
}
