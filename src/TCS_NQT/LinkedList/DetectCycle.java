package TCS_NQT.LinkedList;

import Linked_List.practise.leetcode.ListNode;

public class DetectCycle {
    static boolean detectCycle(ListNode head){
        if(head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            if(slow == null) return false;
            slow = slow.next;

            if(fast.next == null) return false;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }
    static ListNode detectCycle2(ListNode head){
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                slow = head;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

//    static int lengthOfCycle(ListNode head){
//
//    }
}
