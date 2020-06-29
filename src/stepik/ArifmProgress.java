package stepik;

import java.util.Scanner;

public class ArifmProgress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long sum = 0;
        for (int i = 0; i<n+1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
