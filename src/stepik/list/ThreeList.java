package stepik.list;

import java.util.*;

public class ThreeList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String s3 = in.nextLine();
        String[] str1 = s1.split(" ");
        for (int i = 0; i < str1.length; i++) {
            if(Integer.parseInt(str1[i]) > 0){
                arr1.add(Integer.parseInt(str1[i]));
            }
        }
        String[] str2 = s2.split(" ");
        for (int i = 0; i < str2.length; i++) {
            if(Integer.parseInt(str2[i])%2 == 0){
                arr1.add(Integer.parseInt(str2[i]));
            }
        }
        String[] str3 = s3.split(" ");
        for (int i = 0; i < str3.length; i++) {
            if(Integer.parseInt(str3[i])%7 == 0){
                arr1.add(Integer.parseInt(str3[i]));
            }
        }
        Collections.sort(arr1);
        for (int i = 0; i < arr1.size(); i++){
            System.out.print(arr1.get(i)+" ");
        }
    }
}
