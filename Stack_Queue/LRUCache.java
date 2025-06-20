package Data_Structures_Algorithms.Stack_Queue;

public class LRUCache {

    public static void main(String[] args) {
        // LRU Cache
        LRUCache cache = new LRUCache(2);

        // Queries
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.print(cache.get(1) + " ");
        cache.put(3, 3);
        System.out.print(cache.get(2) + " ");
        cache.put(4, 4);
        System.out.print(cache.get(1) + " ");
        System.out.print(cache.get(3) + " ");
        System.out.print(cache.get(4) + " ");
    }

    public LRUCache(int capacity) {

    }

    public void put(int key, int value) {

    }

    public int get(int key) {
        int value=0;


        return value;
    }

}
