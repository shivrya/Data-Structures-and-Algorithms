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
        isPalidrom(head);
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

    public static boolean isPalidrom(ListNode head){
            if (head == null || head.next == null) return true;
    
            // Step 1: Find middle of the list
            ListNode slow = head;
            ListNode fast = head;
            while (fast.next != null && fast != null ) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
    }

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
}
