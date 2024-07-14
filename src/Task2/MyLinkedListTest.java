package Task2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        System.out.println("List size: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        list.remove(1);

        System.out.println("\nList size after removal: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        list.clear();
        System.out.println("\nList size after clear: " + list.size());
    }
}
