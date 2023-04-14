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
    public void add(E element) {
        // Check if it verifies size equals to elements length
        if(size == elements.length) {

        }
        // Increment size and add element to elements' array
        elements[size++] = element;
    }

    // Return data that holds in exact index if it exists
    @Override
    public E get(int index) {
        // Check if index is out of range
        if(0 < index || index >= size) {

        }
        return elements[index];
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
