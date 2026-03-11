package TCS_NQT.LinkedList;

import Linked_List.practise.leetcode.ListNode;

//LeetCode - 2095
public class DeleteMiddle {
    static ListNode deleteMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
