package stepik;

import java.util.Scanner;

public class ostsatok {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        float c = (int) a%b;
        System.out.println(c);
    }
}
