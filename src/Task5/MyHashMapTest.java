package Task5;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put("key1", 23);
        map.put("key2", "value2");
        map.put("key3", 25.8);

        System.out.println("Size: " + map.size());

        System.out.println("Value for key1: " + map.get("key1"));
        System.out.println("Value for key2: " + map.get("key2"));
        System.out.println("Value for key3: " + map.get("key3"));

        map.put("key1", "new value 1");
        System.out.println("Updated value for key1: " + map.get("key1"));

        map.remove("key2");
        System.out.println("Size after removing key2: " + map.size());
        System.out.println("Value for key2 after removal: " + map.get("key2"));

        map.clear();
        System.out.println("Size after clearing: " + map.size());
    }
}
