package stepik.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger big1 = new BigInteger(in.next());
        BigInteger big2 = new BigInteger(in.next());
        big1 = big1.add(big2);
        System.out.println(big1);
    }
}
