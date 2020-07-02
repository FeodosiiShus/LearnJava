package stepik.function;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long digit = in.nextInt();
        System.out.println(isPrime(digit));
    }
    static boolean isPrime(long n){
        if(n < 2) {
            return false;
        }
        double s = Math.sqrt(n);
        for (int i = 2; i < s; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
