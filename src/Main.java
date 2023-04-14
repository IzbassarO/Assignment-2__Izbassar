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
        System.out.println("Size of myList after removing element at index 1: " + myList.size());
    }
}