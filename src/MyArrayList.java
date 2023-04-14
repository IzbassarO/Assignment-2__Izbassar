public class MyArrayList<E> implements List<E> {
    private static final int initialCapacity = 10;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this.elements = new Object[initialCapacity];
        this.size = 0;
    }

    public MyArrayList(int definedCapacity) {
        if (initialCapacity < 0) {
            throw new NegativeArraySizeException("Initial capacity cannot be negative");
        }
        this.elements = new Object[definedCapacity];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }
}
