package stepik.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        String[] arr = {"aa", "ab", "Ac", "BBB"};
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for(String i : set) System.out.print(i + " ");
    }
}
