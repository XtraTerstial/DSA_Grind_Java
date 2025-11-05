package Linked_List.practise.leetcode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        //Base case
        if(head == null) return false;
        if(head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            if(slow == null) return false;
            slow = slow.next;

            if(fast.next == null) return false;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    //Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        ListNode temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
        }
        return slow; // return temp; (can use any)
    }
}
