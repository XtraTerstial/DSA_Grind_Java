package TCS_NQT.LinkedList;

import Linked_List.practise.leetcode.ListNode;

//LeetCode 328
public class OddEvenLinkedList {
    static ListNode oddEven(ListNode head){
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
