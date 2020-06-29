package stepik.arr;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int buff;
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for (int i = arr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    buff = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = buff;
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
