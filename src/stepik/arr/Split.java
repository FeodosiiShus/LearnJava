package stepik.arr;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] str_r = str.split(" - ");
        String[] str_str = str_r[1].split(", ");
        System.out.println(str_r[0]+":");
        for (int i = 0; i < str_str.length; i++){
            System.out.println("-"+str_str[i]);
        }
    }
}
