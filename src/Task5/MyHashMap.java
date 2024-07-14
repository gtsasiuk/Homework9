package Task5;

public class MyHashMap {
    private static class Node {
        Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] table;
    private int size;

    public MyHashMap() {
        table = new Node[16];
        size = 0;
    }

    private int hash(Object key) {
        return key.hashCode() % table.length;
    }

    public void put(Object key, Object value) {
        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value; // Оновлюємо значення
                return;
            }
            current = current.next;
        }


        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
        size++;
    }

    public void remove(Object key) {
        int index = hash(key);
        Node current = table[index];
        Node previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public void clear() {
        table = new Node[16]; // Скидаємо масив
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        int index = hash(key);
        Node current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value; // Повертаємо значення
            }
            current = current.next;
        }
        return null; // Якщо ключ не знайдено
    }
}
