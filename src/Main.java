public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println("Size of myList: " + myList.size());
        System.out.println("Element at index 1: " + myList.get(1));

        myList.remove(1);
//        System.out.println("Size of myList after removing element at index 1: " + myList.size());

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Size of list: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));
        //Does not work now remove method
        myList.remove(2);
        System.out.println("Size of list: " + list.size());
    }
}