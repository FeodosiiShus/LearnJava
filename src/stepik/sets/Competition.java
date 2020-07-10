/*
Программа получает на вход N целых чисел - штрафные баллы i-ого участника и К - мощность множества (количество элементов в нем).

Необходимо выбрать К - элементное множество из уникальных по величине штрафных баллов.
Необходимо вывести множество с минимальной суммой в порядке возрастания штрафных баллов через пробел или -1, если такое множество получить нельзя.

*/
package stepik.sets;

import java.util.*;

public class Competition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nk = in.nextLine().split(" ");
        int n = Integer.parseInt(String.valueOf(nk[0]));
        int k = Integer.parseInt(String.valueOf(nk[1]));
        String[] str = in.nextLine().split(" ");
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(String s: str){
            treeSet.add(Integer.parseInt(s));
        }
        if(k > treeSet.size()) System.out.println(-1);
        else {
            Iterator it = treeSet.iterator();
            for(int i = 0; i < k; i++){
                System.out.print(it.next()+" ");
            }
        }
    }
}
