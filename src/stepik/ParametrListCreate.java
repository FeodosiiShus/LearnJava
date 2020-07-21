package stepik;


import java.util.Objects;

public class ParametrListCreate {
    public static void main(String[] args) {
        ParametrList<Integer> pl = new ParametrList<>();
        pl.add(1);
        pl.add(23);
        pl.add(20);
        pl.add(44556);
        pl.size();
        System.out.println(pl);
        System.out.println(pl.get(1));
        pl.set(0, 33);
        pl.remove(1);
        pl.insert(0, 234);
        System.out.println(pl.find(234));
        System.out.println(pl);
    }
}
class ParametrList<E>{
    private Object[] data;
    private int length;
    Object[] elementData;
    private int size;

    public ParametrList(){
        length = 0;
        data = new Object[10];
    }

    public void add(E element){
        data[length] = element;
        length++;
    }
    public void size(){
        System.out.println(length);
    }

    public E get(int index) {
        Objects.checkIndex(index, length);
        E ind = (E) data[index];
        return ind;
    }
    public E set(int index, E value){
        Objects.checkIndex(index, length);
        E oldValue = (E) data[index];
        data[index] = value;
        return oldValue;
    }

    public E remove(int index) throws IndexOutOfBoundsException{
        if (index >= length)
            throw new ArrayIndexOutOfBoundsException(index);
        E oldValue = (E) data[index];
        int numMoved = length - index - 1;
        if(numMoved > 0)
            System.arraycopy(data, index + 1, data, index, numMoved);
        data[--length] = null;
        return oldValue;
    }

    public void insert(int index, E value){
        //rangeCheckForAdd(index);
        final int s = length;
        System.arraycopy(data, index,
                data, index + 1,
                s - index);
        data[index] = value;
        size = s + 1;
    }

    public int find(E value){
        for (int i = 0; i < length; i++){
            if(data[i].equals(value)) return i;
        }
        return -1;
    }
    private void rangeCheckForAdd(int index) {
        if (index > length || index < 0)
            throw new IndexOutOfBoundsException(index);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            s.append(data[i]).append(" ");
        }
        return s.toString();
    }
}
