package Strings.Easy;
// hi i m devbrat
//Output -> ih i m tarbved
public class Q3_InPlace_Reverse {
    static void reverse(int i,int j,StringBuilder s){
        while(i<=j){
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j,temp);
            i++; j--;
        }
    }
    static String reverseInPlace(String s){
        int n = s.length();
        StringBuilder str = new StringBuilder(s);
        int i=0;
        int j = 0;
        while(j<n){
            if(str.charAt(j) != ' ') j++;
            else{
                reverse(i,j-1,str);
                i=j+1;
                j=i;
            }
        }
        reverse(i, j-1, str);
        return str.toString();
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(s);
        String str = reverseInPlace(s);
        System.out.println("After Reverse :>");
        System.out.println(str);
    }

}
