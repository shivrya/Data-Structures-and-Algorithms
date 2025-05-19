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

public class Foundation_SinglyLinkedList {

    public static void main(String[] args){

            int[] arr = {1111,2,3,4,5};
            Node head = convertArrayToLL(arr);
            //System.out.println(head.value);
            //System.out.println(lengthOfLL(head));
            traverseLL(head);
            //System.out.println();
            //System.out.println(searchElementInLL(head, 11));
            reverseList(head);
            
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

    public static Node reverseList(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;  
    }

    public static Node deleteHead(Node head) {
        if(head==null)
            return null;
            
            Node newHeadNode = head.next;
        head.next = null;
        return newHeadNode;
    }

    public Node deleteTail(Node head) {

        if(head==null || head.next==null)
            return null;

            Node tmp = head;
        while(tmp.next.next!=null){
            tmp = tmp.next;
        }
        tmp.next = null;
        return head;
    }

    public Node deleteKthNode(Node head, int k) {
        if(head==null)
            return null;

        
        if(k==1){
            Node tmp = head;
            head = tmp.next;
            tmp.next = null;
            return head;
        }
        Node tmp = head;
        Node previous = null;
        int counter = 0;

        while(tmp!=null){
            counter++;
            if(counter==k){
                previous.next = previous.next.next;
                tmp.next = null;
                break;
            }
            previous = tmp;
            tmp = tmp.next;
        }
        return head;
    }

    public Node deleteNodeWithValueX(Node head, int X) {
        if(head==null)
            return null;

        if(head.value==X)
            return head.next;
        
        Node tmp = head;
        Node previous = null;

        while(tmp!=null){

            if(tmp.value==X){
                previous.next = previous.next.next;
                tmp.next = null;
            }
            previous = tmp;
            tmp = tmp.next;
        }
        return head;
    }
    
    public static Node insertAtHead(Node head, int X) {

        Node tmp = new Node(X,head);
        return tmp;
    }

    public static Node insertAtTail(Node head, int X) {

        Node tmp = head;
        Node newNode = new Node(X,null);

        if(head==null) 
            return newNode;


        while(tmp.next!=null){
            tmp = tmp.next;            
        }
        tmp.next = newNode;
        return head;
    }

    public Node insertAtKthPosition(Node head, int X, int K) {

        Node newNode = new Node(X,null);

        if(head==null)
            return newNode;
        
        if(K==1){
            newNode.next = head;
            return newNode;
        }
        Node tmp = head;
        int counter=0;

        while(tmp!=null){
            counter++;
            if(counter==K-1){
                newNode.next = tmp.next;
                tmp.next = newNode;
                break;
            }
            tmp = tmp.next;
        }
        return head;
    }

    public Node insertBeforeX(Node head, int X, int val) {
        Node newNode = new Node(val,null);
        Node tmp = head;

        if(head==null)
            return head;

        if(tmp.value==X){
            newNode.next = tmp;
            return newNode;
        }

        while(tmp.next!=null){
                if(tmp.next.value==X){
                    newNode.next = tmp.next;
                    tmp.next = newNode;
                    return head;
                }
                tmp = tmp.next;
        }
        return head;
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
    public static Node deleteHead1(Node head){
        // if head is null then return null
        if(head==null)
            return null;

        Node tmp = head;
        head = head.next;
        tmp = null;
        return head;
    }

    public static Node deleteTail1(Node head){
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
