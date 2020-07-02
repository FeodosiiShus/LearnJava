package stepik.function;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        sort(arr);
    }
    static void sort(int [] a){
        int buff;
        for (int i = a.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(a[j] > a[j+1]){
                    buff = a[j];
                    a[j] = a[j+1];
                    a[j+1] = buff;
                }
            }
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
