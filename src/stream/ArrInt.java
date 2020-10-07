package stream;

import stepik.oop.array.Array;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class ArrInt {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = -3;
        arr[2] = 4;
        arr[3] = -1;
        arr[4] = 3;
        long array = IntStream.of(arr).filter(w -> w > 0).count();
        System.out.println(array);
        var ar3r = 2;
        ar3r = 5;
        System.out.println(ar3r);
    }
}
