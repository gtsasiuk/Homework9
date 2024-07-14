package Task3;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");

        System.out.println("Queue size: " + queue.size());

        System.out.println("Peek: " + queue.peek());

        System.out.println("Poll: " + queue.poll());

        System.out.println("Peek after poll: " + queue.peek());

        System.out.println("Queue size after poll: " + queue.size());

        queue.clear();
        System.out.println("Queue size after clear: " + queue.size());
    }
}
