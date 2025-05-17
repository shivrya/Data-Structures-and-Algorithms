package Data_Structures_Algorithms.LinkedList.SinglyLinkedList;


class Node{
    int value;
    Node next;

    Node(int value, Node next){
        this.value = value;
        this.next  = next;
    }

}

public class DeletionSinglyLinkedList {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node head = convertLLToArray(arr);
        System.out.println("Initial head node:"+ head.value);

        //delete head
        // Node newHeadNode = deleteHead(head);

        //delete tail
        Node newHead = deleteTail(head);
        traverseLL(newHead);
        
    }

    //converts entire array into linkedList
    public static Node convertLLToArray(int[] arr){
        Node head = new Node(arr[0],null);
        Node mover = head;

        for(int i=1;i<arr.length;i++){
            Node tmp = new Node(arr[i],null);
            mover.next = tmp;
            mover = tmp;
        }
        return head;
    }

    // delete head node
    public static Node deleteHead(Node head){
        // if head is null then return null
        if(head==null)
            return null;

        Node tmp = head;
        head = head.next;
        tmp = null;
        return head;
    }

    // traverse and print entire singly linked list
    public static void traverseLL(Node head){
        Node current = head;
        while(current!=null){
            
            System.out.print(current.value + "->");
            current = current.next;
        }
    }

    public static Node deleteTail(Node head){
        int size = 0;

        Node current = head;

        while(current!=null){
            size++;
            current = current.next;
        }
        Node tmp = head;
        for(int i=1;i<=size;i++){
            if(i==size-1){
                tmp.next = null;
                break;
            }
            tmp = tmp.next;
        }
        return head;
    }


}
