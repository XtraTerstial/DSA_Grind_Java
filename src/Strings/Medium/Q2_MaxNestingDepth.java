package Strings.Medium;
/*Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation:
Digit 8 is inside 3 nested parentheses in the string.*/
public class Q2_MaxNestingDepth {
    static void main() {
        String s = "(1+(2*3)+((8)/4))+1";
        int current = 0;
        int ress = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                current ++;
                ress = Math.max(ress,current);
            }
            else if(c == ')')
                current--;
        }
        System.out.println(ress);
    }
}
