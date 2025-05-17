package Data_Structures_Algorithms.LinkedList.SinglyLinkedList;

import java.util.*;
import java.util.Collections;

// Creating custom data type of Node which contains value and address
class Node{
    int value;
    Node next;

    Node(int value,Node next){
        this.value = value;
        this.next = next;
    }

}

public class SinglyLinkedList {

    public static void main(String[] args){

            int[] arr = {1111,2,3,4,5};
            Node head = convertArrayToLL(arr);
            //System.out.println(head.value);
            //System.out.println(lengthOfLL(head));
            traverseLL(head);
            //System.out.println();
            //System.out.println(searchElementInLL(head, 11));
            
    }

    // converts given array into singly linked list
    public static Node convertArrayToLL(int[] arr){
        Node head = new Node(arr[0],null);
        Node mover = head;

        for(int i=1;i<arr.length;i++){
            Node tmp = new Node(arr[i],null);
            mover.next = tmp;
            mover = tmp ;
        }
        return head;

    }

    // Returns length of singly linked list
    public static int lengthOfLL(Node head){
        int length = 0;

        Node current = head;
        while(current!=null){
            length++;
            current = current.next;
        }
        return length;
    }

    // traverse and print entire singly linked list
    public static void traverseLL(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.value + "->");
            current = current.next;
        }
    }

    // check if an element is present in linked list or not
    public static boolean searchElementInLL(Node head,int target){
        boolean isPresent = false;
        Node current = head;
        while(current!=null){
            if(current.value==target)
                isPresent = true;
            current = current.next;
        }
        return isPresent;
    }
}
