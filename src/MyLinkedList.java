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
        // Check if index in range between 0 and size - 1
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == size) {
            add(item); // If index is at the end, simply call the add(E element) method
        } else {
            Node newNode = new Node(item, null, null);
            if (index == 0) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            } else {
                Node currentNode = head;
                for (int i = 0; i < index - 1; i++) {
                    currentNode = currentNode.next;
                }
                newNode.next = currentNode.next;
                newNode.prev = currentNode;
                currentNode.next.prev = newNode;
                currentNode.next = newNode;
            }
            size++;
        }
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
        // Check if index in range between 0 and size
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
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.element.equals(item)) {
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
                return true;
            }
            currentNode = currentNode.next;
        }
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
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int indexOf(Object o) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.element.equals(o)) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;    }

    @Override
    public int lastIndexOf(Object o) {
        Node currentNode = tail;
        int index = size - 1;
        while (currentNode != null) {
            if (currentNode.element.equals(o)) {
                return index;
            }
            currentNode = currentNode.prev;
            index--;
        }
        return -1;
    }

    @Override
    public void sort() {
        // Base condition
        if (size <= 1) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            Node previous = null;

            while (current.next != null) {
                if (((Comparable<E>) current.element).compareTo(current.next.element) > 0) {
                    Node nextNode = current.next;
                    Node furtherNode = current.next.next;

                    if (previous != null) {
                        previous.next = nextNode;
                    } else {
                        head = nextNode;
                    }

                    if (furtherNode != null) {
                        furtherNode.prev = current;
                    } else {
                        tail = current;
                    }

                    current.next = furtherNode;
                    nextNode.prev = previous;
                    nextNode.next = current;
                    current.prev = nextNode;

                    swapped = true;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
        } while (swapped);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node currentNode = head;
        while (currentNode != null) {
            sb.append(currentNode.element.toString());
            if (currentNode.next != null) {
                sb.append(", ");
            }
            currentNode = currentNode.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
