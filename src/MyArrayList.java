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
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        // Increment size and add element to elements' array
        elements[size++] = element;
    }

    // Return data that holds in exact index if it exists
    @Override
    public E get(int index) {
        // Check if index is out of range
        if(0 < index || index >= size) {
            throw new IndexOutOfBoundsException("Index Out Of Range: " + index);
        }

        return (E) elements[index];
    }

    // delete data that holds in exact index if it exists
    @Override
    public E remove(int index) {
        // Check if index in range or not
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }

        E removedElement = (E) elements[index];

        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }

        elements[--size] = null;
        return removedElement;
    }

    @Override
    public boolean contains(E data) {
        return false;
    }

    // returns the current size of MyArrayList object
    @Override
    public int size() {
        return size;
    }
}
