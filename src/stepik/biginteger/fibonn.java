package stepik.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class fibonn {
    public static BigInteger fib2(int n) {
        if (n <= 1) return BigInteger.valueOf(n);

        BigInteger previous = BigInteger.ZERO, next = BigInteger.ONE, sum;

        for (int i = 2; i <= n; i++) {
            sum = previous;
            previous = next;
            next = sum.add(previous);
        }

        return next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // получение n-ого по счёту числа Фибоначчи
        BigInteger fn = fib2(n);

        // вывод n-ого по счёту числа Фибоначчи
        System.out.println(fn);
    }
}
