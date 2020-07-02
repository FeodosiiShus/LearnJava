package stepik.function;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String s){
        char[] st = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            st[i] = s.charAt(i);
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < st.length; i++) {
            if(Character.isLetter(st[i])){
               str.append(st[i]);
            }
        }
        if(str.toString().equalsIgnoreCase(str.reverse().toString())){
            return true;
        }
        else return false;
    }
}
