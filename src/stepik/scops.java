package stepik;

import java.util.Scanner;

public class scops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("[");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("]");
        }
    }
}
