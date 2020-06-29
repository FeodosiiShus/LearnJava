package stepik;

import java.util.Scanner;

public class RoundDigit {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        long a = in.nextLong();
        long b = (long) Math.ceil(a/3.0);
        System.out.println(b);
    }
}
