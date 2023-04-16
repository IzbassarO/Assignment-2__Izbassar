public class MyLinkedList<E> implements List<E> {
    private class Node {
        E element;
        Node next;
        Node prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    private Node head;
    private Node tail;
    private int size;

    @Override
    public void add(E element) {
        Node newNode = new Node(element, null, tail);
        if (size == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public void add(E item, int index) {

    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node currentNode;

        if (index < size / 2) {
            currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = tail;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }

        return currentNode.element;
    }

    @Override
    public E remove(int index) {
        // Check if index in range between 0 and size - 1
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        Node prevNode = currentNode.prev;
        Node nextNode = currentNode.next;

        if (prevNode != null) {
            prevNode.next = nextNode;
        } else {
            head = nextNode;
        }

        if (nextNode != null) {
            nextNode.prev = prevNode;
        } else {
            tail = prevNode;
        }

        size--;
        return currentNode.element;
    }

    @Override
    public boolean remove(E item) {
        return false;
    }

    @Override
    public boolean contains(Object data) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public int size() {
        return size;
    }
}
