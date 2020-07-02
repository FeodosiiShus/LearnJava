package stepik.function;

import java.util.Arrays;
import java.util.Scanner;

public class LongerWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        maxLengthWord(str);

    }
    static void maxLengthWord(String [] s){
        String max = s[0];
        Arrays.sort(s);
        for (int i = 0; i < s.length; i++) {
            if(max.length() < s[i].length()){
                max = s[i];
            }
        }
        System.out.println(max);
    }
}
