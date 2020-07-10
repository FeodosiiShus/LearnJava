/*
* В магазине внедрили автоматизированную систему анализа покупок покупателей. В 2020 году наличные деньги были отменены и все платежи стали открытыми. Каждый магазин в момент платежа получает от покупателя его Фамилию и Имя, а так же список его покупок в формате Наименование товара и сумма покупки.

Например:

Иванов Иван:

    селедка 7
    помидоры 120
    огурцы 110
    устрицы 32
    омары 36
    лобстер 45
Программа получает на вход строки в следующем формате: Фамилия пробел Имя пробел Наименование товара пробел сумма.
Система формирует отчет за месяц, в котором информация обо всех покупателях и обо всех покупках для каждого покупателя.
Покупатели отсортированы по алфавиту, покупки отсортированы по наименованию по алфавиту, в пределах конкретного покупателя.
Внимательно посмотрите на примеры! Если не понятно - оставляйте свои вопросы в комментариях.
На выводе, перед каждым продуктом ставится 4 пробела!
*
*
* */
package stepik.sets;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BuyProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<String, TreeMap<String, Integer>> treeMap = new TreeMap<>();
        while (in.hasNext()){
            String str = in.nextLine();
            if(str.isEmpty()) break;
            String str1[] = str.split(" ");
            String fullName = str1[0]+" "+str1[1];
            String product = str1[2];
            Integer cost = Integer.parseInt(str1[3]);
            if(!treeMap.containsKey(fullName)) treeMap.put(fullName, new TreeMap<String, Integer>());
            TreeMap<String, Integer> prod = treeMap.get(fullName);
            if(!prod.containsKey(product)) prod.put(product, 0);
            Integer oldCost = prod.get(product);
            prod.put(product, oldCost+cost);
        }
        for (Map.Entry<String, TreeMap<String, Integer>> entry: treeMap.entrySet()){
            String key = entry.getKey();
            TreeMap<String, Integer> productCost = entry.getValue();
            System.out.print(key+":"+" ");
            System.out.println();
            for(Map.Entry<String, Integer> products: productCost.entrySet()){
                String keyProduct = products.getKey();
                Integer valueProduct = products.getValue();
                System.out.println("    "+keyProduct+" "+valueProduct);
            }
        }
    }
}
