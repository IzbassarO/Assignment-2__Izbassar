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
    public E get(int index) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean contains(E data) {
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
    public int size() {
        return size;
    }
}
