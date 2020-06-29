package stepik.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        ArrayList<String> str1 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str1.addAll(Arrays.asList(str.split(" ")));
        String str_rev = new StringBuffer(str).reverse().toString();
        str1.addAll(Arrays.asList(str_rev));
        for(int i = 0; i < str1.size(); i++){
            System.out.print(str1.get(i));
        }
    }
}
