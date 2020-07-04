package stepik.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger bg1 = new BigInteger(in.next());
        BigInteger bg2 = new BigInteger(in.next());
        bg1 = bg1.gcd(bg2);
        System.out.println(bg1);
    }
}
