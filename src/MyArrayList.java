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

    @Override
    public void add(E item, int index) {
        // Check if index is out of range
        if (index < 0 || index > size) { // Corrected: changed index >= size to index > size
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }

        // Check if it verifies size equals to elements length
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, size); // Corrected: use System.arraycopy for efficient copying
            elements = newElements;
        }

        // Shift elements to the right to make space for the new item
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        // Insert the new item and increment size
        elements[index] = item;
        size++;
    }

    // Return data that holds in exact index if it exists
    @Override
    public E get(int index) {
        // Check if index is out of range
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
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
    public boolean remove(E item) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && elements[i].equals(item)) {
                remove(i); // Corrected: use remove(int index) to remove item
                return true;
            }
        }
        return false;    }

    @Override
    public boolean contains(Object data) {
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && elements[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for(int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public int indexOf(Object o) {
        for(int i = 0; i < elements.length; i++) {
            if(elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for(int i = elements.length - 1; i >= 0; i--) {
            if(elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<E>) elements[j]).compareTo((E) elements[j + 1]) > 0) {
                    // Swap elements[j] and elements[j + 1]
                    E temp = (E) elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }

    // returns the current size of MyArrayList object
    @Override
    public int size() {
        return size;
    }
}
