public interface List<E> {
    void add(E element);
    E get(int index);
    E remove(int index);
    boolean contains(E data);
    int size();
}
