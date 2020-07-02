package stepik.function;

import java.util.Scanner;

public class printN {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        printN(n);
    }
    static void printN(int n){
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= i; j++)
                System.out.print(i);
    }
}
