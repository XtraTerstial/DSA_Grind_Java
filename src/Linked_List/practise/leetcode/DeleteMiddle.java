package Linked_List.practise.leetcode;
//LL - 2095 Delete the Middle Node of a Linked List
// use Slow Fast Pointer (Tortoise-Rabbit method)
//Move slow by one and fast by Two
//while the condition will be fast.next.next.next != null for odd
//while the condition will be fast.next.next != null for even
public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
