package Task4;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println("Stack size: " + stack.size());

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());

        System.out.println("Peek after pop: " + stack.peek());

        System.out.println("Stack size after pop: " + stack.size());

        stack.push(0.25);
        stack.push(0.5);

        stack.remove(1); // Видаляє "Element 2"

        System.out.println("Stack size after remove: " + stack.size());

        for (int i = 0; i < stack.size(); i++) {
            System.out.println("Element at index " + i + ": " + stack.get(i));
        }

        stack.clear();
        System.out.println("Stack size after clear: " + stack.size());
    }
}
