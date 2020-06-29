package stepik;

import java.util.Scanner;

public class BinarySystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String z =Integer.toBinaryString(n);
        System.out.println(z);
    }
}
