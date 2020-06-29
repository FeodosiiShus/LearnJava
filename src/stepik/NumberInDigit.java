package stepik;

import java.util.Scanner;

public class NumberInDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0, chet = 1, nechet = 0;
        int nn;
        while (n > 0){
            nn = n%10;
            if(nn%2 == 0){
                chet *= nn;
            }
            else{
                nechet++;
            }
            n = n /10;

        }
        if(chet==1) chet = 0;
        System.out.println(nechet+" "+chet);
    }
}
