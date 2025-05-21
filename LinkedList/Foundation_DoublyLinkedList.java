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
        int[] nums = {10, 20, 30, 40};
        ListNode head = arrayToLinkedList(nums);
        printList(head);
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
}
