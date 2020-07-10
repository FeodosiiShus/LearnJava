/*
Вводится несколько строк по два слова в каждой - имена двух друзей. Дружба - вещь взаимная(с двух сторон!!!). Иначе люди - не друзья.

Необходимо вывести ответ в соответствии с примерами ниже - список друзей. Список состоит из имен людей,
список выстроен в лексографическом порядке(по алфавиту) по возрастанию, после имени человека идет фраза " дружит с : ",
далее следует список имен его друзей, выстроенный так же по возрастанию.
 */
package stepik.sets;

import javax.xml.namespace.QName;
import java.util.*;

public class Friends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<String, TreeSet<String>> treeMap = new TreeMap<>();
        while (in.hasNext()){
            String str1 = in.nextLine();
            String[] str = str1.split(" ");
            if(str1.isEmpty()) break;
            String keyName = str[0];
            String friend = str[1];
            if(treeMap.containsKey(keyName)) treeMap.get(keyName).add(friend);
            else{
                TreeSet<String> treeSet = new TreeSet<>();
                treeSet.add(friend);
                treeMap.put(keyName, treeSet);
            }

            String keyName2 = str[1];
            String friend2 = str[0];
            if(treeMap.containsKey(keyName2)) treeMap.get(keyName2).add(friend2);
            else{
                TreeSet<String> treeSet = new TreeSet<>();
                treeSet.add(friend2);
                treeMap.put(keyName2, treeSet);
            }
        }
        for(String name: treeMap.keySet()){
            System.out.print(name + " дружит с : ");
            for(String friendName: treeMap.get(name)){
                System.out.print(friendName+" ");
            }
            System.out.println();
        }
    }
}
