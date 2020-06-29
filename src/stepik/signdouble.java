package stepik;

import java.io.IOException;
import java.util.Scanner;

public class signdouble {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a =  in.nextInt();
        int b = in.nextInt();
        float d = (float)a/b;
        System.out.printf("%.2f", d);
    }
}
