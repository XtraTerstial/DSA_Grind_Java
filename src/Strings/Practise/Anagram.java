package Strings.Practise;

public class Anagram {
    static boolean check(String a, String b){
        if(a.length() != b.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)-'a']++;
            freq[b.charAt(i)-'a']--;
        }
        for (int count : freq){
            if(count != 0) return false;
        }
        return true;
    }
    static void main() {
        String a = "anagram";
        String b = "margana";
        System.out.println(check(a,b));
    }
}
