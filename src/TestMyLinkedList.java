public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();

        // Add elements
        myList.add(30);
        myList.add(10);
        myList.add(20);

        // Print elements
        System.out.println("Elements in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Test addFirst method
        myList.addFirst(5);

        // Test addLast method
        myList.addLast(40);

        // Test getFirst and getLast methods
        System.out.println("First element: " + myList.getFirst());
        System.out.println("Last element: " + myList.getLast());

        // Test removeFirst and removeLast methods
        myList.removeFirst();
        myList.removeLast();

        // Test remove method
        myList.remove(1);

        // Test set method
        myList.set(0, 100);

        // Test sort method
        myList.sort();

        // Test indexOf method
        System.out.println("Index of 100: " + myList.indexOf(100));

        // Test exists method
        System.out.println("Exists 200? " + myList.exists(200));

        // Test toArray method
        Object[] array = myList.toArray();
        System.out.println("Array:");
        for (Object element : array) {
            System.out.println(element);
        }

        // Test clear method
        myList.clear();
        System.out.println("Size after clearing: " + myList.size());
    }
}
