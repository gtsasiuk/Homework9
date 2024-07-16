package Task4;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println("Stack size: " + stack.size());

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());

        System.out.println("Peek after pop: " + stack.peek());

        System.out.println("Stack size after pop: " + stack.size());

        MyStack<Double> doubleStack = new MyStack<>();
        doubleStack.push(0.25);
        doubleStack.push(0.5);

        doubleStack.remove(1); // Видаляє 0.5

        System.out.println("Double stack size after remove: " + doubleStack.size());

        for (int i = 0; i < doubleStack.size(); i++) {
            System.out.println("Element at index " + i + ": " + doubleStack.get(i));
        }

        stack.clear();
        System.out.println("Stack size after clear: " + stack.size());
    }
}
