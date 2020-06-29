package stepik.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TwoListInOne {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String firstN = in.nextLine();
        int n = Integer.parseInt(firstN);
        String[] s1 = in.nextLine().split(" ");
        for (int i = 0; i < n; i++){
            arr1.add(Integer.parseInt(s1[i]));
        }
        String secondM = in.nextLine();
        int m = Integer.parseInt(secondM);
        String[] s2 = in.nextLine().split(" ");
        for (int i = 0; i < m; i++){
            arr1.add(Integer.parseInt(s2[i]));
        }
        arr1.sort(Collections.reverseOrder());
        for (int i = 0; i < arr1.size(); i++){
            System.out.print(arr1.get(i)+" ");
        }
    }
}
