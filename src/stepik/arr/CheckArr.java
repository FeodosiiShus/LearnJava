package stepik.arr;

import java.util.Scanner;

public class CheckArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int a[] = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
            if(arr[i]%2 == 0 && arr[i] > 0 && arr[i] > 9 && arr[i] < 100){
                a[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < a.length; i++){
            if(a[i] > 0) {
                System.out.print(a[i] + " ");
            }
        }
        if(j == 0){
            System.out.println(-1);
        }
    }
}
