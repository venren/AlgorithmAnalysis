package Design;

public class LRUTest {
    public static void main(String[] args) {
        LRUCache<String> cache = new LRUCache<>();
        cache.set(1,"abc");
        cache.get(1);

        cache.set(2,"cde");
        cache.set(3,"efg");
        cache.set(4,"dgh");
        cache.set(5,"dfj");

        cache.get(1);
    }
}
