package stepik.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DifficultPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initialString = scanner.nextLine().trim();
        StringBuilder builder = new StringBuilder(initialString);
        for (int i = 0; i < initialString.length()-1; i++) {
            builder.reverse();
            StringBuilder reverce = new StringBuilder(builder);
            builder.reverse();
           // System.out.println(builder + " - " + reverce);
            if (builder.toString().equals(reverce.toString())) break;
            builder.insert(initialString.length(), initialString.charAt(i));
            //System.out.println(builder.toString());
        }
        System.out.print(builder.toString());
        }
    }
