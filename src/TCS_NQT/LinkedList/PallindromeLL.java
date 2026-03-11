package TCS_NQT.LinkedList;

import Linked_List.practise.leetcode.ListNode;
//LeetCode -234
public class PallindromeLL {
    static ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode prev = null, nxt = null;
        while(current != null){
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        return prev;
    }
    static boolean isPallindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverse(slow.next);
        slow.next = temp;

        ListNode first_half = head;
        ListNode second_half = slow.next;

        while(second_half != null){
            if(first_half.val != second_half.val) return false;
            first_half = first_half.next;
            second_half = second_half.next;
        }
        return true;
    }
}
