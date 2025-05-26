package Data_Structures_Algorithms.LinkedList;

class ListNode {
    int value;
    ListNode prev;
    ListNode next;

    ListNode() {
        this.value = 0;
        this.prev = null;
        this.next = null;
    }

    ListNode(int value, ListNode prev, ListNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    ListNode(int value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}

public class Foundation_DoublyLinkedList {

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40,50};
        ListNode head = arrayToLinkedList(nums);
        printList(head);
        // isPalidrom(head);
    }

    public static ListNode arrayToLinkedList(int[] nums) {
        if (nums.length == 0) return null;

        ListNode head = new ListNode(nums[0], null, null);
        ListNode tmp = head;

        for (int i = 1; i < nums.length; i++) {
            ListNode newNode = new ListNode(nums[i], tmp, null);
            tmp.next = newNode;
            tmp = newNode;
        }
        return head;
    }

    public static void printList(ListNode head) {
        ListNode tmp = head;
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    // Delete head  from the doubly linked list
    public ListNode deleteHead(ListNode head) {

        if(head==null)
            return head;
        
        if(head.next==null)
            return null;
        

        ListNode tmp = head.next;
        tmp.prev = null;
        head.next = null;
        return tmp;

    }

    // Delete tail from the doubly linked list
    public ListNode deleteTail(ListNode head) {

        if(head==null || head.next==null)
            return null;
        
        ListNode tmp = head;

        while(tmp.next!=null){
            tmp = tmp.next;
        }
        ListNode previous = tmp.prev;

        previous.next = null;
        tmp.prev = null;
        return head;
    }

    // Delete Kth node from the doubly linked list
    public ListNode deleteKthElement(ListNode head, int k) {
        if(head==null || head.next==null)
            return null;

        if(k==1){
            ListNode tmp = head.next;
            tmp.prev = null;
            head.next = null;
            return tmp;
        }

        int counter = 0;
        ListNode tmp = head;

        while(tmp!=null){
            counter++;
            if(counter==k-1){
                ListNode element = tmp.next;
                tmp.next = element.next;

                if(element.next!=null){
                    ListNode another = element.next;
                    another.prev = tmp;
                }
                element.next = null;
                element.prev = null;
                break;
            }

            tmp = tmp.next;
        }
        return head;
    }

    // Delete given node from the doubly linked list
    public void deleteGivenNode(ListNode node) {
        ListNode tmp = node;
        ListNode previous = tmp.prev;
        ListNode nextNode = node.next;

        if(previous!=null&& nextNode!=null){
            previous.next = nextNode;
            nextNode.prev = previous;
            tmp.prev = null;
            tmp.next = null;
            
        }else if(previous==null){
            nextNode.prev = null;
            tmp.next = null;
        }else if(nextNode==null){
            previous.next = null;
            tmp.prev = null;
        }

    }
}
