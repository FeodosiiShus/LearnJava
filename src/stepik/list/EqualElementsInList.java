package stepik.list;

import java.util.*;

public class EqualElementsInList {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        String[] s1 = in.nextLine().split(" ");
        String[] s2 = in.nextLine().split(" ");
        for (String value : s1) {
            arr1.add(Integer.parseInt(value));
        }
        for (String s : s2) {
            arr2.add(Integer.parseInt(s));
        }
        int j = 0;
        if(arr1.size() > arr2.size()){
            while (j < arr2.size()){
                for(int i = 0; i < arr1.size(); i++){
                    if(arr1.get(i).equals(arr2.get(j))){
                        arr3.add(arr1.get(i));
                    }
                }
                j++;
            }
        }
        else if(arr2.size() > arr1.size()){
            while (j < arr1.size()){
                for(int i = 0; i < arr1.size(); i++){
                    if(arr2.get(i).equals(arr1.get(j))){
                        arr3.add(arr2.get(i));
                    }
                }
                j++;
            }
        }
        Set<Integer> set = new HashSet<>(arr3);
        arr3.clear();
        arr3.addAll(set);
        for (int i = 0; i < arr3.size(); i++) {
            System.out.print(arr3.get(i)+" ");
        }
    }
}
