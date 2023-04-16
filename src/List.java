public interface List<E> {
    int size();
    void add(E element);
    void add(E item, int index);
    E get(int index);
    E remove(int index);
    boolean remove(E item);
    boolean contains(Object data);
    void clear();
    int indexOf(Object o);
    int lastIndexOf(Object o);
    void sort();
    String toString();
}