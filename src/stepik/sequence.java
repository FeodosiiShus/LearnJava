package stepik;

import java.util.Scanner;

public class sequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int min = 1;
        while(in.hasNextInt()){
            a = in.nextInt();
            if(a < min){
                min = a;
            }
        }
        System.out.println(min);
    }
}
