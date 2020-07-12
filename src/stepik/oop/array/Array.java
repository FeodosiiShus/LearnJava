/**
 *
 * Спроектируйте класс Array.
 *
 * Массив должен обладать двумя свойствами:
 *
 * public int size
 * public int [] data
 * В в классе Array должен быть реализован метод:
 *
 * public void add(int element)
 * Данный метод должен помещать новый элемент в конец массива, а длину массива увеличивать на 1.
 *
 * В случае переполнения - необходимо увеличить длину массива data (необходимо выделить новый кусок большей длины, и скопировать в него данные, добавленные в data на предыдущих шагах)
 *
 * Проверка вашего класса осуществляется слеующим способом:
 *
 * Создается экземпляр вашего класса inst
 * Случайным образом формируется число N от 1 до 10^510
 * 5
 *
 * Случайные числа от 1 до 100 - N раз добавляются добавляются в ваш массив методом add
 * Проверяется inst.size, inst.data[i], для i от 0 до N-1
 *
 */

package stepik.oop.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public int size = 0;
    public int[] data = new int[1];
    public void add(int element){
        if(size == data.length-1)
            data = Arrays.copyOf(data, data.length*2);
        data[size++] = element;
    }
}
