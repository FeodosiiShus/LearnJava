package stepik.arr;

import java.util.Arrays;
import java.util.Scanner;

public class MinusString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] str_s = str.split(" ");
        char[] s1 = str_s[0].toCharArray();
        char[] s2 = str_s[1].toCharArray();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i] == s2[j]) {
                    s1[i] = ' ';
                    s2[j] = ' ';
                }
            }
        }
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != ' ') {
                System.out.print(s1[i]);
            }
        }
        for (int j = 0; j < s2.length; j++){
            if(s2[j] != ' '){
                System.out.print(s2[j]);
            }
        }
    }
}

