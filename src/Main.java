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

        // Checking if 20 exists in myList object
        System.out.println("Contains 20: " + myList.contains(20)); // Output: Contains 20: false

        // Sorting the list
        myList.sort();

        // Clearing the list
        myList.clear();


        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        MyLinkedList<String> list = new MyLinkedList<>();

        // Add elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        System.out.println("List after adding elements: " + list);

        // Add cherry at a specific index
        list.add("cherry", 2);
        System.out.println("List after adding element at index 2: " + list);

        // Get  element at a specific index
        System.out.println("Element at index 3: " + list.get(3));

        // Remove an element at a specific index
        list.remove(1);
        System.out.println("List after removing element at index 1: " + list);

        // Remove by value
        list.remove("cherry");
        System.out.println("List after removing element by value: " + list);

        // Check if the list contains value
        System.out.println("List contains 'banana': " + list.contains("banana"));

        // Get index
        System.out.println("Index of 'date': " + list.indexOf("date"));

        // Get the last index
        System.out.println("Last index of 'grape': " + list.lastIndexOf("grape"));

        // Sort the list
        list.sort();
        System.out.println("List after sorting: " + list);

        // Clear object
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}