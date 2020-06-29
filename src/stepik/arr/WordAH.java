package stepik.arr;

import java.util.Scanner;

public class WordAH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strings = str.split(" ");
        for (int i = 0; i < strings.length; i++){
            if(strings[i].startsWith("a") || strings[i].startsWith("b")  || strings[i].startsWith("c") || strings[i].startsWith("d") || strings[i].startsWith("e") || strings[i].startsWith("f") || strings[i].startsWith("g") || strings[i].startsWith("h")|| strings[i].startsWith("A") || strings[i].startsWith("B") || strings[i].startsWith("C") || strings[i].startsWith("D") || strings[i].startsWith("E") || strings[i].startsWith("F") || strings[i].startsWith("G") || strings[i].startsWith("H")){
                System.out.println(strings[i]);
            }
        }
    }
}
