package stepik.oop.stack;

import java.util.ArrayList;
import java.util.Collections;

public class CreateStack {
    public static void main(String[] args) {
        Stack inst = new Stack() ;
        inst.push(4);
        inst.push(8);
        inst.push(1);
        inst.push(3);
        inst.push(6);

        for(int i=0; i<5; i++) {
            System.out.println("верхушка " + inst.pop());
            System.out.println("минимум " + inst.getMin());
            System.out.println("максимум " + inst.getMax());
            System.out.println("длина стека " + inst.size());
            System.out.println("проверка на пустоту " + inst.isEmpty() + "\n");
        }
    }
}
class Stack{
    private ArrayList<Integer> arrayList = new ArrayList<>();

    void push(int value){
        arrayList.add(value);
    }

    int size(){
        return arrayList.size();
    }

    boolean isEmpty(){
        if(arrayList.size() == 0){
            return true;
        }
        return false;
    }

    int getMax(){
        if(arrayList.isEmpty()) return 0;
        return Collections.max(arrayList);
    }

    int getMin(){
        if(arrayList.isEmpty()) return 0;
        return Collections.min(arrayList);
    }

    int pop(){
        return arrayList.remove(arrayList.size()-1);

    }
}
