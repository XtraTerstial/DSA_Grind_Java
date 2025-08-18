package Strings.Practise;
//DeVbRAT
//Output-> dEvBrat
public class ToggleWords {
    static String toggle(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < n; i++) {
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 65 && ascii <= 90){
                ascii +=32;
            }
            else if(ascii >= 97 && ascii <= 122){
                ascii -= 32;
            }
            ch = (char) ascii;
            sb.setCharAt(i,ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "DeVbRAt";
        String str = toggle(s);
        System.out.println(str);
    }
}
