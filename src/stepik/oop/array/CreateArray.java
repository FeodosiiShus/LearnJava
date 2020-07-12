package stepik.oop.array;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        Array arr = new Array();
        arr.add(3);
        System.out.println(Arrays.toString(arr.data));
    }
}
