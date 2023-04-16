# Assignment-2__Izbassar
My project is to create already created ArrayList and LinkedList

Created by Izbassar Orynbassar
SE-2202

MyArraList class and MyLinkedList has interface List:

size
•	returns the size of an array.
•	type of method is int

add(E element)
•	add an element value to the last index of an array
•	type of method is void

add(E item, int index)
•	add an element value to a specific index of an array
•	type of method is void

get(int index)
•	returns an value stored in array's cell by specific index
•	type of method is E(generic) will output supposted type of data as array's data type

remove(int index)
•	removes a value at a specific index
•	type of method is E(generic type), E could be any data type

remove(E item)
•	returns is this item was removed or not. Outputs true or false.
•	type of method is boolean, and type of parameter(item) is generic type - E

contains(Object data)
•	checks if value consists in the array
•	type of method is boolean

clear()
•	make all array cells empty which is making them null and size equals to 0
•	type of method is void

indexOf(Object o)
•	returns an index where element value is positioned in the array starts from the begging which is 0
•	type of method is int

lastIndexOf(Object 0)
•	returns an index where element value is positioned in the array starts from the end which is size of array - 1
•	type of method is int

sort
•	sorts an array if interfer from smallest to the largest and the same principle with other data types as String
•	type of method is void

toString
• is inputs an arrays data, not a hash code of an object
•	type of method is String

Also, some moments sorting is bubble sort.

Made an object of 2 classes in the main class where object of MyArrayList(myList) and MyLinkedList(list). 

myList contains Integer type, whereas list contains String

Overall, there are 12 methods.
