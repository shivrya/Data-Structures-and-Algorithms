package Data_Structures_Algorithms.Stack_Queue;

import java.util.HashMap;

class Node{
    int key,value;
    public Node prev;
    public Node next;
    Node(){
        key = -1;
        value = -1;
        prev = null;
        next = null;
    }

    Node(int key, int value){
        this.key = key;
        this.value = value;
        prev = null;
        next = null;
    }
}

public class LRUCache {

    private int cap;
    HashMap<Integer, Node> map;
    private Node head;
    private Node tail;

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
        this.cap = capacity;
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public void deleteNode(Node node){
        Node previous = node.prev;
        Node next = node.next;

        previous.next = next;
        next.prev = previous;
    }

    public void insertAfterHead(Node node){
        Node afterHead = head.next;
        head.next = node;
        afterHead.prev = node;
        node.prev = head;
        node.next = afterHead;
    }


    public void put(int key, int value) {

    }

    public int get(int key) {
        int value=0;


        return value;
    }

}
