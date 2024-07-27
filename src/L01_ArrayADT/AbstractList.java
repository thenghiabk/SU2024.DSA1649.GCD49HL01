package L01_ArrayADT;

public interface AbstractList {
    boolean add(int element);
    int remove(int index);
    int get(int index);
    int set(int index, int element);
    int size();
    int indexOf(int element);
    boolean contains(int element);
    boolean isEmpty();
}
