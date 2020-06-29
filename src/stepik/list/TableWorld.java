package stepik.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TableWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> arr1 = new ArrayList<>();
        String str = in.nextLine();
        String[] str1 = str.split("");
        for (int i = 0; i < str1.length; i++) arr1.add(str1[i]);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i)+" ");
        }
        System.out.println();
        //String
        for (int i = 0; i < arr1.size()-2; i++){
            System.out.print(arr1.get(i+1)+" ");
            for (int j = 0; j < arr1.size()-2; j++) {
                System.out.print("0 ");
            }
            System.out.print(arr1.get((arr1.size()-2)-i)+" ");
            System.out.println();
        }
        Collections.reverse(arr1);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.print(arr1.get(i)+" ");
        }
    }
}
