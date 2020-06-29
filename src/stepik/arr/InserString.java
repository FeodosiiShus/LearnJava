package stepik.arr;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class InserString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strings = str.split(" ");
        for (int j = 0; j < strings.length; j++) {
            for (int i = j + 1; i < strings.length; i++) {
                if (strings[i].compareTo(strings[j]) < 0) {
                    String t = strings[j];
                    strings[j] = strings[i];
                    strings[i] = t;
                }
            }
           // System.out.println(strings[j] + ">>"+ j);
        }
        System.out.println(strings[0]);
    }
}
