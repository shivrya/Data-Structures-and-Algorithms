package Data_Structures_Algorithms.LinkedList;


class Node{
    int value;
    Node prev;
    Node next;

    Node(){
        this.value = 0;
        this.prev = null;
        this.next = null;
    }

    Node(int value,Node prev, Node next){
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    Node(int value){
        this.value = value;
        this.next = null;
        this.prev = null;
    }

}


public class Foundation_DoublyLinkedList {

    public static void main(String[] args) {
        
    }

}
