package stepik.list;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckList {
    public static void main(String[] args) {
        ArrayList<Integer> integ = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        while (!str.equals("printList")){
            String[] s1 = str.split(" ");
            switch (s1[0]) {
                case "create" -> {
                    for(int i = 0; i < Integer.parseInt(s1[1]); i++){
                        integ.add(i);
                    }
                }
                case "add" -> {
                    if(s1.length == 3){
                        integ.add(Integer.parseInt(s1[1]), Integer.parseInt(s1[2]));
                    }
                    else{
                        integ.add(Integer.parseInt(s1[1]));
                    }
                    }
                case "remove" -> integ.remove(Integer.parseInt(s1[1]));
                case "set" -> integ.set(Integer.parseInt(s1[1]),Integer.parseInt(s1[2]));
            }
            str = in.nextLine();
        }
        for (Integer integer : integ) {
            System.out.print(integer + " ");
        }

    }
}
