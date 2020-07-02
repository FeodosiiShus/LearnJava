package stepik.function;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        summ();
    }
    static void summ(){
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        n = n + m;
        System.out.println(n);
    }
}
