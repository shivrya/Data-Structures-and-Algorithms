package Data_Structures_Algorithms.LinkedList;

// Creating custom data type of Node which contains value and address
class Node{
    int value;
    Node next;

    Node(int value,Node next){
        this.value = value;
        this.next = next;
    }
}

public class LogicBuidling {

    public static void main(String[] args){

        int[] arr1 = {1111,2,3,4,5};
        Node head1 = convertArrayToLL(arr1);
        int[] arr2 = {1111,2,3,4,5};
        Node head2 = convertArrayToLL(arr2);

        Node newNode = addTwoNumbers(head1,head2);
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

    //Logic Building Question 1
    public static Node addTwoNumbers(Node l1, Node l2) {

        // create number from L1
        Node l1head = l1;
        int counter = 0;
        int l1number = 0;

        while(l1head!=null){
            l1number += l1head.value * Math.pow(10,counter);
            counter++;
            l1head = l1head.next;
        }
        
        // create number from L2
        Node l2head = l2;
        counter = 0;
        int l2number = 0;

        while(l2head!=null){
            l2number += l2head.value * Math.pow(10,counter);
            counter++;
            l2head = l2head.next;
        }

        // combine both numbers
        int finalnumber = l1number + l2number;

        // create third linkedlist
        Node newHead = new Node(0,null);
        Node tmp = newHead;

        while(finalnumber>0){
            int n = finalnumber % 10;
            finalnumber = finalnumber / 10;
            tmp.next = new Node(n,null);
            tmp = tmp.next;

        }
        return newHead.next;
    }
}
